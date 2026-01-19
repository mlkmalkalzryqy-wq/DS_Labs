package BinaryTree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int rootValue) {
        root=new Node(rootValue,null,null);
    }

    private void insert(Node newNode, Node rNode){
        if(newNode.getValue()> rNode.getValue()){
            if(rNode.getRight()==null){
                rNode.setRight(newNode);
            }
            else
                insert(newNode,rNode.getRight());

        }
        else if(newNode.getValue()< rNode.getValue()){
            if(rNode.getLeft()==null){
                rNode.setLeft(newNode);
            }
            else
                insert(newNode,rNode.getLeft());
        }
    }

    public void insertNode(int value){
        Node newNode=new Node(value,null,null);
        insert(newNode,root);
    }

    private boolean search(int value, Node rnode){
        if(rnode==null) return false;
        if (value> rnode.getValue())
            return search(value,rnode.getRight());
        else if (value< rnode.getValue())
            return search(value,rnode.getLeft());
        else
            return true;
    }
    public boolean searchNode(int svalue){
        return search(svalue,root);
    }

    private void preOrder(Node rnode){
        if (rnode==null)return;
        System.out.print(rnode.getValue()+" ");
        preOrder(rnode.getLeft());
        preOrder(rnode.getRight());
    }
    public void preOrderr(){
        preOrder(root);
        System.out.println();

    }



    private void iNOrder(Node rnode){
        if (rnode==null)return;
        iNOrder(rnode.getLeft());
        System.out.print(rnode.getValue()+" ");
        iNOrder(rnode.getRight());
    }
    public void iNOrderr(){
        iNOrder(root);
        System.out.println();

    }

    private void postOrder(Node rnode){
        if (rnode==null)return;
        postOrder(rnode.getLeft());
        postOrder(rnode.getRight());
        System.out.print(rnode.getValue()+" ");

    }
    public void postOrderr(){
        postOrder(root);
        System.out.println();
    }





    class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }



}