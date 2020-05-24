# 学习笔记
> 见：algorithm009-class02/Week_01/学习笔记.jpg

# 本周作业
- 简单：
- [X] 用 add first 或 add last 这套新的 API 改写 Deque 的代码
    > 见: algorithm009-class02/Week_01/src/newApi4Queue.java

- [X] 分析 Queue 和 Priority Queue 的源码
    > 1. Queue 是一个集成了 Collection 的接口类，定义了 add/offer、remove/poll、element/peek 四套方法，每套方法中的两者区别在于异常情况处理返回；
    > 2. PriorityQueue 底层实现方法是数组，通过指定 Comparator ，在执行入队、出队等操作时，进行比较从而完成操作，满足优先级高的元素先行；

- [X] 删除排序数组中的重复项（Facebook、字节跳动、微软在半年内面试中考过）
    > see: algorithm009-class02/Week_01/src/removeDuplicates.java
    
- [ ] 旋转数组（微软、亚马逊、PayPal 在半年内面试中考过）
- [ ] 合并两个有序链表（亚马逊、字节跳动在半年内面试常考）
- [ ] 合并两个有序数组（Facebook 在半年内面试常考）
- [ ] 两数之和（亚马逊、字节跳动、谷歌、Facebook、苹果、微软在半年内面试中高频常考）
- [ ] 移动零（Facebook、亚马逊、苹果在半年内面试中考过）
- [ ] 加一（谷歌、字节跳动、Facebook 在半年内面试中考过）
- 中等：
- [ ] 设计循环双端队列（Facebook 在 1 年内面试中考过）
- 困难：
- [ ] 接雨水（亚马逊、字节跳动、高盛集团、Facebook 在半年内面试常考）
