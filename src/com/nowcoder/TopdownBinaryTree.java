package com.nowcoder;
import java.util.ArrayList;

public class TopdownBinaryTree {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null) return list;

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.remove(0);
            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
            list.add(tmp.val);
        }
        return list;
    }
}
