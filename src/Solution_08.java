/**
 * 题目信息：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 主要思路：这题是斐波那契数列的变种，上到第n阶台阶的跳法设为f(n),上到第n阶有两种方式
 *          1.从n-1阶上去、2.从n-2阶上去，则有f(n)=f(n-1)+f(n-2)。所以同样有递归和动态规划
 *          两种方式可以解决。
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_08 {

    /**
     * 递归法
     * @param n
     * @return
     */
    public int JumpFloor_1(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return JumpFloor_1(n-1)+JumpFloor_1(n-2);

    }


    /**
     * 动态规划
     * @param n
     * @return
     */
    public int JumpFloor_2(int n) {
        int f=0,g=1;
        while(n-- != 0){
            g+=f;
            f = g-f;
        }

        return f;
    }




}
