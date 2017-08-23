/**
 * 题目信息：操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 主要思路：递归交换左右孩子的值
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_18 {

    public void Mirror(TreeNode root) {
        if(root != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            Mirror(root.left);
            Mirror(root.right);

        }
    }

}
