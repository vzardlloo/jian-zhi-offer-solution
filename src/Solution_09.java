/**
 * 题目信息：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 *
 * 主要思路：设到第n级台阶的方式有f(n)种，则由题意：f(n)=f(n-1)+f(n-2)+...+f(2)+f(1).
 *           所以同样有f(n-1)=f(n-2)+f(n-3)+...+f(2)+f(1),则有f(n)=2*f(n-1)。
 *
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_09 {

    /**
     * 递归
     * @param target
     * @return
     */
    public int JumpFloorII_1(int target) {
        if(target == 1) return 1;
        if(target==2) return 2;
        else return 2*JumpFloorII_1(target-1);
    }

    /**
     *非递归
     * @param target
     * @return
     */
    public int JumpFloorII_2(int target) {

        int n = 1;
        while (--target != 0){

            n *= 2;
        }

        return n;

    }


    /**
     * 位运算（sao cao zuo)
     * @param target
     * @return
     */
    public int JumpFloorII_3(int target) {

        return 1<<--target;

    }


}
