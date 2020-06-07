/**
 * 二叉树的最近公共祖先
 * <p>
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class lowestCommonAncestor {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 题解方法
     * 1.
     * 2.
     * 3.
     */

    /**
     * 后序遍历
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode solution1(TreeNode root, TreeNode p, TreeNode q) {
        // 1. 递归终止条件：若root是 p 或 q 的最近父节点，则只会存在以下情况：
        // p 和 q 在 root 的子树中，且分列 root 的 异侧（即分别在左、右子树中）；
        // p = root or q=root
        if (root == null || root == p || root == q) {
            return root;
        }

        // 2. 处理当前逻辑

        // 3. 下探
        TreeNode left = this.solution1(root.left, p, q);
        TreeNode right = this.solution1(root.right, p, q);

        // 4. 清理

        //
        if (left == null && right == null) return null;
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }


    public static void main(String args[]) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t6 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t0 = new TreeNode(0);
        TreeNode t8 = new TreeNode(8);
        TreeNode t7 = new TreeNode(7);
        TreeNode t4 = new TreeNode(4);
        t3.left = t5;
        t3.right = t1;
        t2.left = t7;
        t2.right = t4;
        t5.left = t6;
        t5.right = t2;
        t1.left = t0;
        t1.right = t8;


        // System.out.println(new lowestCommonAncestor().solution1(t3, t5, t1).val);
        // System.out.println(new lowestCommonAncestor().solution1(t3, t5, t4).val);
        System.out.println(new lowestCommonAncestor().solution1(t3, t7, t0).val);
    }

}
