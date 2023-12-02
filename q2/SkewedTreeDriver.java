package q2;

public class SkewedTreeDriver {

    public static void main(String[] args) {
        //ascending order
        int order = 0;

        // Creating a sample Binary Search Tree (BST)
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);

        // Creating an instance of SkewedTreeConverter
        SkewedTreeConverter converter = new SkewedTreeConverter(root);
        // Convert BST to skewed tree
        converter.flattenBSTToSkewed(order);

        // Display node values in ascending/descending order
        System.out.print("Node values in " + "ascending"+ " order: ");
        converter.traverseRightSkewed();
    }
}
