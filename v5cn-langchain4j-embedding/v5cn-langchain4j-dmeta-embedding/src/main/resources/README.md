需要下载一个基础模型文件[Dmeta-embedding-zh](https://huggingface.co/DMetaSoul/Dmeta-embedding-zh)
模型文件中没有`onnx`文件需要使用`optimum-cli`命令转换为`onnx`模型文件
```shell
pip install --upgrade pip
pip install optimum onnx onnxruntime
optimum-cli export onnx --model ./Dmeta-embedding-zh --task question-answering ./onnx-output-folder
```