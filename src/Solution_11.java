/**
 * 题目信息：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 *
 * 主要思想：利用位运算，n&(n-1)可以去掉n二进制表示的最低位的一个1
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_11 {

    public int numberOf1(int n){
        int count = 0;
        while (n != 0){
            n = n&(n-1);
            count ++;
        }
        return count;
    }
}
