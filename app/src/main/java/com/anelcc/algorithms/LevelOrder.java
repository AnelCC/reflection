package com.anelcc.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> matriz = new ArrayList<List<Integer>>();
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();

        if (root == null) {
            return matriz;
        }

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        current.add(root);

        while (!current.isEmpty()) {
            TreeNode node = current.remove();

            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);

            nodeValues.add(node.val);
            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<TreeNode>();
                matriz.add(nodeValues);
                nodeValues = new ArrayList();
            }

        }
        return matriz;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
