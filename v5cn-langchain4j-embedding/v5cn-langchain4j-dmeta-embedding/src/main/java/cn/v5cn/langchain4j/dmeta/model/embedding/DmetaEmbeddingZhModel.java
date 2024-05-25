package cn.v5cn.langchain4j.dmeta.model.embedding;

import dev.langchain4j.model.embedding.AbstractInProcessEmbeddingModel;
import dev.langchain4j.model.embedding.OnnxBertBiEncoder;
import dev.langchain4j.model.embedding.PoolingMode;

/**
 * Dmeta-embedding 是一款跨领域、跨任务、开箱即用的中文 Embedding 模型，适用于搜索、问答、智能客服、LLM+RAG 等各种业务场景，支持使用 Transformers/Sentence-Transformers/Langchain 等工具加载推理。
 * <a href="https://huggingface.co/DMetaSoul/Dmeta-embedding-zh">Dmeta-embedding-zh</a>
 * @author ZYW
 */
public class DmetaEmbeddingZhModel extends AbstractInProcessEmbeddingModel {

    private static final OnnxBertBiEncoder MODEL = loadFromJar(
            "dmeta-embedding-zh.onnx",
            "tokenizer.json",
            PoolingMode.MEAN
    );

    @Override
    protected OnnxBertBiEncoder model() {
        return MODEL;
    }
}
