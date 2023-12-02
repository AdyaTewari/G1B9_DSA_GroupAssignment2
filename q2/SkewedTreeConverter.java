// SkewedTreeConverter.java
package q2;
public class SkewedTreeConverter {

    private Node root;
    private Node prevNode;
    private Node headNode;

    public SkewedTreeConverter(Node root) {
        this.root = root;
        this.prevNode = null;
        this.headNode = null;
    }

    public void flattenBSTToSkewed(int order) {
        flattenBSTToSkewedHelper(root, order);
    }

    private void flattenBSTToSkewedHelper(Node root, int order) {
        if (root == null) {
            return;
        }

        if (order > 0) {
            flattenBSTToSkewedHelper(root.right, order);
        } else {
            flattenBSTToSkewedHelper(root.left, order);
        }

        Node rightNode = root.right;
        Node leftNode = root.left;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        if (order > 0) {
            flattenBSTToSkewedHelper(leftNode, order);
        } else {
            flattenBSTToSkewedHelper(rightNode, order);
        }
    }

    public void traverseRightSkewed() {
        traverseRightSkewedHelper(headNode);
    }

    private void traverseRightSkewedHelper(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewedHelper(root.right);
    }
}
