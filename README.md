# 人工智能实验

## 1-知识表示

实验内容：
参照课程第二部分讲授的知识表示方法完成，包括产生式系统、框架系统、语义网络等（还可以选择其他方法）解决以下问题（不限于此），必要时上网查找有关参考文献。
猴子摘香蕉问题：
一个房间里，天花板上挂有一串香蕉，有一只猴子可在房间里任意活动（到处走动，推移箱子，攀登箱子等）。设房间里还有一只可被猴子移动的箱子，且猴子登上箱子时才能摘到香蕉，问猴子在某一状态下（设猴子位置为A，香蕉位置在B，箱子位置为C），如何行动可摘取到香蕉。

## 2-MNIST手写体识别实验 

本例子会实现一个简单的图片分类的功能，整体流程如下：

1、处理需要的数据集，这里使用了MNIST数据集。

1、  定义一个网络，这里我们使用LeNet网络。

2、  定义损失函数和优化器。

3、  加载数据集并进行训练，训练完成后，查看结果及保存模型文件。

4、  加载保存的模型，进行推理。

验证模型，加载测试数据集和训练后的模型，验证结果精度。