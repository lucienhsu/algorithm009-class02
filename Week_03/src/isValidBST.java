/**
 * 验证二叉搜索树
 * <p>
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class isValidBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    long pre = Long.MIN_VALUE;

    /**
     * 题解方法
     * 1.
     * 2.
     * 3.
     */

    /**
     * 解题思路1：
     *
     * @param root
     */
    public boolean solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 访问左子树
        if (!solution(root.left)) {
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return solution(root.right);
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        System.out.println(new isValidBST().solution(treeNode));
     }

}
