package com.nowcoder;

public class BST2List {
    TreeNode pre = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return pRootOfTree;
        ConvertSub(pRootOfTree);
        TreeNode res = pRootOfTree;
        while (res.left != null) {
            res = res.left;
        }
        return res;
    }

    private void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;

        ConvertSub(pRootOfTree.left);

        pRootOfTree.left = pre;
        if (pre != null) pre.right = pRootOfTree;
        pre = pRootOfTree;

        ConvertSub(pRootOfTree.right);
    }
}
