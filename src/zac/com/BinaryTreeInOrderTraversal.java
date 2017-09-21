package zac.com;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by zac on 5/8/17.
 */
public class BinaryTreeInOrderTraversal
{
    List<Integer> result;

    public BinaryTreeInOrderTraversal()
    {
        result = new ArrayList<>();
    }

    /**
     * Recursively
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalRecursive(TreeNode root)
    {
        if (root == null)
            return result;

        inorderTraversalRecursive(root.left);

        result.add(root.val);

        inorderTraversalRecursive(root.right);

        return result;
    }

    /**
     * Iteratively
     *
     * @param node
     * @return
     */
    public List<Integer> inorderTraversalIteratively(TreeNode node)
    {
        Deque<TreeNode> stack = new ArrayDeque<>();

        result = new ArrayList<>();

        TreeNode cur = node;

        while (cur != null || !stack.isEmpty())
        {
            if (cur != null)
            {
                stack.push(cur);

                cur = cur.left;
            }
            else
            {
                TreeNode temp = stack.pop();

                result.add(temp.val);

                cur = cur.right;
            }
        }
        return result;
    }
}
