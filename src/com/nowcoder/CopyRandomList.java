package com.nowcoder;

public class CopyRandomList {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) return null;

        // 1. 复制链表
        RandomListNode curNode = pHead;
        while (curNode != null) {
            RandomListNode cloneNode = new RandomListNode(curNode.label);
            cloneNode.next = curNode.next;
            curNode.next = cloneNode;
            curNode = cloneNode.next;
        }

        // 2. 处理random指针
        curNode = pHead;
        while (curNode != null) {
            RandomListNode cloneNode = curNode.next;
            cloneNode.random = curNode.random != null ? curNode.random.next : null;
            curNode = cloneNode.next;
        }

        // 3. 拆分链表
        curNode = pHead;
        RandomListNode node = curNode.next;
        RandomListNode tmp = null;
        while (curNode.next != null) {
            tmp = curNode.next;
            curNode.next = tmp.next;
            curNode = tmp;
        }
        return node;
    }
}
