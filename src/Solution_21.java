import java.util.Stack;

/**
 * 题目信息：输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 * 主要思路：开始“指针”指向popA第一个元素，用一个辅助栈，把pushA里的元素依次压入栈中，在这过程中，每压入一个后要进行一个
 *          判断，如果此时栈非空，并且栈顶元素等于popA“指针”指向的元素，则栈顶元素弹出，popA指针向后移动一位，然后继续进行
 *          判断，如果满足则继续重复之前的动作。否则（判断条件不满足）则将pushA中的下一个元素压入栈。全部执行完毕后若辅助栈
 *          为空则popA是弹出序列反之则不是弹出序列。
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_21 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if(pushA.length != popA.length) return false;
        if(pushA.length==0 || popA.length==0) return false;
        //辅助栈
        Stack<Integer> s = new Stack<>();

        int popIndex = 0;
        for(int i=0;i<pushA.length;i++){
            s.push(pushA[i]);
            while(!s.empty() && s.peek()==popA[popIndex]){
                s.pop();
                popIndex++;
            }
        }
        return s.empty();
    }

}
