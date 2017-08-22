import java.util.Stack;

/**
 * 题目信息：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *          使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *          并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 主要思路：建立两个栈，一个存放奇数，一个存放偶数，然后遍历数组，把奇数放到奇数栈，
 *          把偶数放到偶数栈，然后从数组尾部开始依次把偶数栈和奇数栈里的数放入数组。
 *
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_13 {

    public void reOrderArray(int [] array) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        for(int i=0;i < array.length;i++){
            if (array[i]%2 == 0){
                even.add(array[i]);
            }else {
                odd.add(array[i]);
            }

        }

        //从尾部再次装入数组
        int index = 1;
        while (!even.isEmpty()){
                array[array.length-index] = even.pop();
                index ++;
        }

        while (!odd.isEmpty()){
            array[array.length-index] = odd.pop();
            index ++;
        }


    }

}
