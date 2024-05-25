package cn.v5cn.langchain4j.text2vec.model.embedding;

import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.spi.model.embedding.EmbeddingModelFactory;

/**
 * text2vec-base-chinese embedding model 工厂类.
 * <a href="https://huggingface.co/shibing624/text2vec-base-chinese">text2vec-base-chinese</a>
 *
 * @author ZYW
 */
public class Text2VecBaseChineseEmbeddingModelFactory implements EmbeddingModelFactory {
    @Override
    public EmbeddingModel create() {
        return new Text2VecBaseChineseEmbeddingModel();
    }
}
