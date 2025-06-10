package Training;

import java.util.*;

//  1st Program
//
//class TreeNode {
//    int val;
//    TreeNode left, right;
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//public class Assignment17 {
//
//    public static TreeNode buildTreeLevelOrder(Scanner sc) {
//        System.out.println("Enter root value:");
//        int rootVal = sc.nextInt();
//        if (rootVal == -1) return null;
//
//        TreeNode root = new TreeNode(rootVal);
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode current = queue.poll();
//
//            System.out.println("Enter left child of " + current.val + " (-1 for null):");
//            int leftVal = sc.nextInt();
//            if (leftVal != -1) {
//                current.left = new TreeNode(leftVal);
//                queue.offer(current.left);
//            }
//
//            System.out.println("Enter right child of " + current.val + " (-1 for null):");
//            int rightVal = sc.nextInt();
//            if (rightVal != -1) {
//                current.right = new TreeNode(rightVal);
//                queue.offer(current.right);
//            }
//        }
//
//        return root;
//    }
//
//    public static void levelOrderTraversal(TreeNode root) {
//        if (root == null) return;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        System.out.println("Level Order Traversal:");
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            System.out.print(node.val + " ");
//
//            if (node.left != null) queue.offer(node.left);
//            if (node.right != null) queue.offer(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeNode root = buildTreeLevelOrder(sc);
//        levelOrderTraversal(root);
//        sc.close();
//    }
//}


//  2nd Program

//class TreeNode {
//    int val;
//    TreeNode left, right;
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//public class Assignment17 {
//
//    public static TreeNode buildTreeLevelOrder(Scanner sc) {
//        System.out.println("Enter root value:");
//        int rootVal = sc.nextInt();
//        if (rootVal == -1) return null;
//
//        TreeNode root = new TreeNode(rootVal);
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode current = queue.poll();
//
//            System.out.println("Enter left child of " + current.val + " (-1 for null):");
//            int leftVal = sc.nextInt();
//            if (leftVal != -1) {
//                current.left = new TreeNode(leftVal);
//                queue.offer(current.left);
//            }
//
//            System.out.println("Enter right child of " + current.val + " (-1 for null):");
//            int rightVal = sc.nextInt();
//            if (rightVal != -1) {
//                current.right = new TreeNode(rightVal);
//                queue.offer(current.right);
//            }
//        }
//
//        return root;
//    }
//
//    public static void levelOrderTraversal(TreeNode root) {
//        if (root == null) return;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        System.out.println("Level Order Traversal:");
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            System.out.print(node.val + " ");
//
//            if (node.left != null) queue.offer(node.left);
//            if (node.right != null) queue.offer(node.right);
//        }
//        System.out.println();
//    }
//
//    public static int countLeafNodes(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null) return 1;
//
//        return countLeafNodes(root.left) + countLeafNodes(root.right);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeNode root = buildTreeLevelOrder(sc);
//
//        levelOrderTraversal(root);
//
//        int leafCount = countLeafNodes(root);
//        System.out.println("Number of leaf nodes: " + leafCount);
//
//        sc.close();
//    }
//}



//  3rd Program


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Assignment17 {

    // Build tree from level order input
    public static TreeNode buildTreeLevelOrder(Scanner sc) {
        System.out.println("Enter root value:");
        int rootVal = sc.nextInt();
        if (rootVal == -1) return null;

        TreeNode root = new TreeNode(rootVal);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.println("Enter left child of " + current.val + " (-1 for null):");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

            System.out.println("Enter right child of " + current.val + " (-1 for null):");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.offer(current.right);
            }
        }

        return root;
    }

    // Level order traversal
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        System.out.println("Level Order Traversal:");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println();
    }

    // Count leaf nodes
    public static int countLeafNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // Find height of the tree
    public static int findHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = buildTreeLevelOrder(sc);

        levelOrderTraversal(root);

        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafCount);

        int height = findHeight(root);
        System.out.println("Height of the tree: " + height);

        sc.close();
    }
}
