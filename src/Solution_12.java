/**
 * 题目信息：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 *
 * 主要思想：将指数分为大于0和小于0两种方式讨论
 *
 * Created by V-zar on 2017/8/22.
 */
public class Solution_12 {

    public double Power(double base, int exponent) {
        double sum = 1.00;
        if(exponent >=0){
            for(int i=0;i<exponent;i++){
                sum =sum * base;
            }
        }else{
            for(int i=0;i<(-exponent);i++){
                sum = sum * base;
            }
            sum = 1/sum;
        }
        return sum;
    }

}
