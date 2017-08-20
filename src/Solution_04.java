import java.util.Arrays;

/**
 *
 * 题目信息：
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 *主要思路：前序遍历的第一个元素就是根节点，然后在中序序列中找到根节点的位置，该位置左边为左子树的中序序列，右边为右子树
 *          中序序列，然后根据左右子树的元素个数来在前序序列中进行划分（前面为左子树，后面为右子树），然后递归执行。
 *          简而言之，前序序列是为了得到每次划分后的（根）节点，中序序列提供划分点
 *
 * Created by V-zar on 2017/8/20.
 */
public class Solution_04 {



    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0||in.length == 0){
            return null;
        }
    TreeNode node = new TreeNode(pre[0]);
    for(int i = 0; i < in.length; i++){
        if(pre[0] == in[i]){
            node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
            node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
        }
    }
        return node;
    }
}





//define tree
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }