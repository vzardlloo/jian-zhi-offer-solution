/**
 * 题目信息：输入一个链表，反转链表后，输出链表的所有元素。
 *
 *
 * 主要思路：
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_15 {

    public ListNode ReverseList(ListNode head) {

        if (head == null) return null;
        ListNode tempNext = null;
        ListNode temp = null;
        while (head != null){
            tempNext = head.next;
            head.next = temp;
            temp = head;
            head = tempNext;

        }

        return temp;

    }



}


