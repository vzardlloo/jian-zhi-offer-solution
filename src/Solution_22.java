import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目信息：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * 主要思路：就是树的BFS，利用一个队列存放节点
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_22 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //建立一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        //存放最终结果
        ArrayList<Integer> arrayList = new ArrayList<>();
        //考虑root为空的情况
        if (root == null) return arrayList;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            arrayList.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }


        }

        return arrayList;

    }

}
