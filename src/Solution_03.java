import java.util.ArrayList;
import java.util.Stack;

/**
 *题目信息：
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 *主要思路：利用一个栈，把链表的每个节点顺序存入栈中，
 *          然后再从栈中依次取出。
 *
 * Created by V-zar on 2017/8/19.
 */
public class Solution_03 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> st = new Stack<>();
        while(listNode != null){

            st.push(listNode.val);
            listNode = listNode.next;

        }
        ArrayList<Integer> arr = new ArrayList<>();
        while(!st.isEmpty()){
            arr.add(st.pop());
        }




        return arr;

    }

}

//define List
class ListNode {
      int val;
       ListNode next = null;
               ListNode(int val) {
           this.val = val;
        }
}