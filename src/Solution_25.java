/**
 *
 * 题目信息：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 *          另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，
 *          输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * 主要思想：
 *
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_25 {
    public RandomListNode Clone(RandomListNode pHead){

        if (pHead == null){
            return null;
        }

        //复制链表元素
        RandomListNode pCur = pHead;
        while (pCur != null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;

            pCur = node.next;
        }
        //复制random指向
        pCur = pHead;
        while (pCur != null){
            if (pCur.random != null){

                pCur.next.random = pCur.random.next;
                pCur = pCur.next.next;

            }
        }

        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pCur = pHead;

        //拆分链表
        while (pCur != null){
            pCur.next = pCur.next.next;
            if (cur.next != null)  cur.next = cur.next.next;

            cur = cur.next;
            pCur = pCur.next;

        }



        return head;
    }



}


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}