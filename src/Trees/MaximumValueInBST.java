package Trees;

class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class MaximumValueInBST {
    public static int getMaximumValue(BinaryTreeNode root) {
        // Base case: if the root is null, return Integer.MIN_VALUE
        if (root == null)
            return Integer.MIN_VALUE;

        // Traverse to the rightmost node (which will have the maximum value)
        while (root.right != null)
            root = root.right;

        // Return the value of the rightmost node
        return root.value;
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(5);
        root.right = new BinaryTreeNode(20);
        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(8);
        root.right.left = new BinaryTreeNode(15);
        root.right.right = new BinaryTreeNode(25);

        System.out.println("Maximum value in the BST: " + getMaximumValue(root));
    }
}
