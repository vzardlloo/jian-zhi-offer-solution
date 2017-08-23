import java.util.ArrayList;

/**
 * 题目信息：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *          例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *          则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 主要思路：可以画图便于理解，关键是Layer的计算和边界条件
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_19 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int row = matrix.length; //行数
        int col = matrix[0].length; //列数
        /**
         * layer:层数
         * {min(row,col):layer}的关系：
         *   1 --> 1,
         *   2 --> 1,
         *   3 --> 2,
         *   4 --> 2,
         *   5 --> 3,
         *   ...
         *   找出规律为：layer = (min(row,col)-1)/2 +1
         *
         */
        int layer = (Math.min(row,col)-1)/2 + 1;
        for(int i=0;i<layer;i++){
            //从左到右
            for(int k=i;k<col-i;k++) array.add(matrix[i][k]);
            //从上到下
            for(int k=i+1;k<row-i;k++) array.add(matrix[k][col-i-1]);
            //从右到左
            for(int k=col-i-2;k>=i&&((row-i-1)!=i);k--) array.add(matrix[row-i-1][k]);
            //从下到上
            for(int k=row-i-2;k>i&&(col-i-1!=i);k--) array.add(matrix[k][i]);
        }

        return array;
    }


}
