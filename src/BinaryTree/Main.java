package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTree=new BinaryTree(10);
        bTree.insertNode(4);
        bTree.insertNode(12);
        bTree.insertNode(3);
        bTree.insertNode(8);
        bTree.insertNode(9);
        bTree.insertNode(11);
        bTree.insertNode(13);
        System.out.println(bTree.searchNode(11));

        System.out.println(" preorder traversal:");
        bTree.preOrderr();
        System.out.println(" inorder traversal:");
        bTree.iNOrderr();
        System.out.println(" postorder traversal:");
        bTree.postOrderr();







    }


}