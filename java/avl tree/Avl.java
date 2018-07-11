public class Avl<T> {
    private int size;
    private Node<T> root;
    int h;


    private class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;
        Node<T> parent;

        Node(T data) {
            this.data = data;
            left = right = parent = null;
        }
    }


    public Avl(Node<T> root) {
        size = 0;
        this.root = root;
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (root == null) {
            root = node;
            size++;
            return;
        }
add(root,node);

    }


    private void add(Node<T> root, Node<T> newNode) {
        h=0;
        if (((Comparable<T>) newNode.data).compareTo(root.data) > 0) {
            if (root.right == null) {
                root.right = newNode;
                newNode.parent = root;
                size++;
            } else {
                add(root.right, newNode);
            }
        } else
            if (root.left == null) {
                root.left = newNode;
                size++;
            } else {
                add(root.left, newNode);
            }


        checkBalance(newNode);

    }

    public int getHeight(Node node){
        return height(node);
    }

    private int height(Node node) {

        if(node.parent==null){
return h;
       }
       else {
            return 1+height(node.parent);}

    }

private void checkBalance(Node node){
    System.out.println(getHeight(node));

}
    public int getSize(){
        return size;
    }

}
