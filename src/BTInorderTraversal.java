import java.util.ArrayList;
import java.util.List;

public class BTInorderTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        var res = new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }

    /**
     * 中序遍历固定写法
     * @param root 根节点
     * @param res 整个树的list
     */
    public void inorder (TreeNode root,List<Integer> res) {
        if (root == null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }


}
