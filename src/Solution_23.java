import java.util.Arrays;

/**
 * 题目信息：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *          如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 主要思路：和前面的重建二叉树思路（Solution_04)相似.先假设它是二叉搜索树的后序遍历的结果，
 *          那么数组最后一个为root，前半部分为小于root的左子树，后半部分为大于root的右子树。
 *          然后进行验证，先从头开始遍历数组找到第一个大于root的元素，这个元素右边的元素理论上
 *          都应该大于root,然后遍历这部分进行验证，一旦发现小于root立刻返回false,若通过验证则
 *          root节点--左子树--右子树这层通过验证，再接着递归验证左子树和右子树。
 *
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_23 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        int root = sequence[sequence.length-1];
        int index = 0;
        for (;index < sequence.length;index ++){
            //得到第一个大于root的数，
            if (sequence[index] > root) break;
        }

        //一旦发现小于root立刻返回false
        for (int j=index;j<sequence.length-1;j++){
            if (sequence[j] < root) return false;
        }

        boolean left = true;
        boolean right = true;

        if (index > 0)
         //Arrays.copyOfRange(array,from,to) 不包含to
        left = VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,index));
        if (index<sequence.length-1)
        right = VerifySquenceOfBST(Arrays.copyOfRange(sequence,index,sequence.length-1));

        return right&&left;
    }

}
