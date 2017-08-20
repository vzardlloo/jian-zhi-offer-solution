import java.util.Stack;

/**
 * 题目信息：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 主要思路：栈是先入后出，队列是先入先出，所以两个栈把一个栈中元素依次压入另一个栈在依次取出即可
 *
 *
 * Created by V-zar on 2017/8/20.
 */
public class Solution_05 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
