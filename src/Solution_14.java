/**
 * 题目信息：输入一个链表，输出该链表中倒数第k个结点。
 *
 *
 * 主要思路：用两个指针，一个先走k-1步，然后在一起走，当先走的指针到链表尾部时，第二个指针的位置就是倒数第k个
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_14 {

    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k < 1) return null;
        ListNode pointer = head;
        for (int i=0;i<k-1;i++){
            if (head.next != null){
                head = head.next;
            }else {
                return null;
            }

        }

        while (head.next != null){
            head = head.next;
            pointer = pointer.next;
        }


        return pointer;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
