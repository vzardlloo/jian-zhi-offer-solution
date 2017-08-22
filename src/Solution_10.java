/**
 *
 * 题目信息：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *          请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 *
 * 主要思路：还是斐波拉切数列的变种，n型矩形填充可以退化成n-1和n-2型，即f(n)=f(n-1)+f(n-2)。
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_10 {


    /**
     * 非递归
     * @param target
     * @return
     */
    public int RectCover_1(int target) {
        if(target == 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int tempNum = 1;
        int result = 2;
        while(target > 2){
            result += tempNum;
            tempNum = result-tempNum;
            target--;
        }
        return result;
    }

    /**
     * 递归
     * @param target
     * @return
     */
    public int RectCover_2(int target) {
        if(target == 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        else return RectCover_2(target-1)+RectCover_2(target-2);
    }



}
