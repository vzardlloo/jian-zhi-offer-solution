/**
 * 题目信息：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 *          n<=39
 *
 * 主要思路：1.递归，方法简单，但是如果n太大会爆栈
 *          2.动态规划，每次只和前两个数有关，花费空间小
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_07 {


    /**
     * 递归法
     * @param n
     * @return
     */
    public int Fibonacci_1(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return Fibonacci_1(n-1)+Fibonacci_1(n-2);

    }


    /**
     * 动态规划
     * @param n
     * @return
     */
    public int Fibonacci_2(int n) {
        int f=0,g=1;
        while(n-- != 0){
            g+=f;
            f = g-f;
        }

        return f;
    }



}
