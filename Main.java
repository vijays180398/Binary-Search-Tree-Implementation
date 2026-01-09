public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.print("In-order: ");
        bst.inorder(bst.root);

        System.out.print("\nPre-order: ");
        bst.preorder(bst.root);

        System.out.print("\nPost-order: ");
        bst.postorder(bst.root);

        System.out.println("\n\nSearch 40: " + bst.search(bst.root, 40));
        System.out.println("Search 90: " + bst.search(bst.root, 90));

        bst.root = bst.delete(bst.root, 30);

        System.out.print("\nIn-order after deleting 30: ");
        bst.inorder(bst.root);
    }
}
