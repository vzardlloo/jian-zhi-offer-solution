/**
 * 题目信息：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 *
 * 主要思路：先定义一个isSubTree()函数，判断是否是子树，然后递归寻找是否有子树。
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_17 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
        if(root1==null && root2!=null) return false;
        return isSubTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
        return false;
    }

}
