package cn.v5cn.langchain4j.dmeta.model.embedding;

import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.spi.model.embedding.EmbeddingModelFactory;

/**
 * Dmeta Embedding Model Factory
 * @author ZYW
 */
public class DmetaEmbeddingZhModelFactory implements EmbeddingModelFactory {
    @Override
    public EmbeddingModel create() {
        return new DmetaEmbeddingZhModel();
    }
}
