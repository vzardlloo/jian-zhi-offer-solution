/**
 *
 * 题目信息：
 *
 * 主要思路：从头比较两个链表节点的值，较小的放入新链表，然后“指针”想前移动一步，继续比较
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_16 {

    /**
     * 递归法
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge_1(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<=list2.val){
            list1.next = Merge_1(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge_1(list1,list2.next);
            return list2;
        }
    }


    public ListNode Merge_2(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode mergeHead = null;
        ListNode current = null;
        while (list1 != null && list2 != null){
           if (list1.val < list2.val){
               if (mergeHead == null){
                   mergeHead = current = list1;
               }else {
                   current.next = list1;
                   current = current.next;
               }
               list1 = list1.next;
           }else {
               if (mergeHead == null){
                   mergeHead = current = list2;
               }else {
                   current.next = list2;
                   current = current.next;
               }
               list2 = list2.next;
           }


        }

        if (list1 == null){
            current.next = list2;
        }
        if (list2 == null){
            current.next = list1;
        }


        return mergeHead;

    }




}
