import java.util.ArrayList;

/**
 * 题目信息：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *          路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * 主要思路：
 *
 *
 *
 * Created by V-zar on 2017/8/23.
 */
public class Solution_24 {
    //存储一条路径
    ArrayList<Integer> path = new ArrayList<>();
    //存储所有路径
    ArrayList<ArrayList<Integer>> allPath = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        //原封不动返回allPath
        if (root == null) return allPath;
        path.add(root.val);
        target -= root.val;
        //是叶节点且和为target的路径加入allpath
        if (target == 0 && root.left == null && root.right == null) {
            allPath.add(new ArrayList<>(path));
        }

        FindPath(root.left,target);
        FindPath(root.right,target);

        //如果此路不通，回退移除最后一个元素
        path.remove(path.size()-1);

        return allPath;
    }



}
