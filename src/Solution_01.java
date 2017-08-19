/**
 *题目描述：
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 主要思路：暴力遍历:-D
 *
 *
 * Created by V-zar on 2017/8/19.
 */
public class Solution_01 {
    public boolean Find(int target, int [][] array) {

        for(int i=0;i<array.length;i++){

            for(int j=0;j<array[i].length;j++){
                if(array[i][j] == target)
                    return true;
            }
        }
        return false;
    }


}
