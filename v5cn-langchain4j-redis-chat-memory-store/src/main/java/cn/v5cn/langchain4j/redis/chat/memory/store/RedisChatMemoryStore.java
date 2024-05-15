package cn.v5cn.langchain4j.redis.chat.memory.store;

import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.store.memory.chat.ChatMemoryStore;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;

import java.util.List;
import java.util.Optional;

/**
 * 把聊天记录存储到Redis中
 *
 * @author ZYW
 */
public class RedisChatMemoryStore implements ChatMemoryStore {
    private final RedissonClient client;

    public RedisChatMemoryStore(RedissonClient client) {
        this.client = client;
    }
    @Override
    public List<ChatMessage> getMessages(Object memoryId) {
        RList<ChatMessage> list = client.getList(memoryId.toString());
        return Optional.ofNullable(list.readAll()).orElse(List.of());
    }

    @Override
    public void updateMessages(Object memoryId, List<ChatMessage> messages) {
        RList<ChatMessage> rList = client.getList(memoryId.toString());
        rList.addAll(messages);
    }

    @Override
    public void deleteMessages(Object memoryId) {
        client.getBucket(memoryId.toString()).delete();
    }
}
