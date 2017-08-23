import java.util.Iterator;
import java.util.Stack;

/**
 * 题目信息：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 *
 *
 * 主要思路：开始没看懂，后来发现就是遍历一下栈然后找到最小元素就OK.
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_20 {
    Stack<Integer> stack = new Stack<>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
       int min = stack.peek();
       int temp = 0;
       Iterator<Integer> iterator = stack.iterator();
       while (iterator.hasNext()){
           temp = iterator.next();
           if(min > temp){
               min = temp;
           }

       }
        return min;
    }


}



