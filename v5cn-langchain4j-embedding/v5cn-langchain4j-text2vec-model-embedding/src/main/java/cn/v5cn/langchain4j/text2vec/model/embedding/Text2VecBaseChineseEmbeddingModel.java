package cn.v5cn.langchain4j.text2vec.model.embedding;

import dev.langchain4j.model.embedding.AbstractInProcessEmbeddingModel;
import dev.langchain4j.model.embedding.OnnxBertBiEncoder;
import dev.langchain4j.model.embedding.PoolingMode;

/**
 * text2Vec-base-chinese Embedding Model实现类
 * <a href="https://huggingface.co/shibing624/text2vec-base-chinese">text2vec-base-chinese</a>
 *
 * @author ZYW
 */
public class Text2VecBaseChineseEmbeddingModel extends AbstractInProcessEmbeddingModel {

    private static final OnnxBertBiEncoder MODEL = loadFromJar(
            "text2vec-base-chinese.onnx",
        "tokenizer.json",
            PoolingMode.MEAN
    );

    @Override
    protected OnnxBertBiEncoder model() {
        return MODEL;
    }
}
