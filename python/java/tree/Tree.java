public class Tree<E> {
    private Node root;
    private int size = 0;

    private class Node {
        E data;
        Node left, right;

        public Node(E data) {
            this.data = data;
            left = right = null;
        }
    }

    //initialize a tree with root data
    public Tree(E data) {
        root = new Node(data);
        size++;
    }

    public void add(E data) {
        if (root == null) {
            root = new Node(data);

        } else {
            add(data, root);
        }

        size++;

    }

    private void add(E data, Node root) {
        if (((Comparable<E>) data).compareTo(root.data) >= 0) {
            if (root.right == null) {
                root.right = new Node(data);
                return;
            }
            add(data, root.right);

        }
        if (root.left == null) {
            root.left = new Node(data);
            return;
        }
        add(data, root.left);
    }

    public boolean contains(E data) {

        return contains(data, root);
    }

    private boolean contains(E data, Node root) {
        if (root == null) {
            return false;
        }
        if (((Comparable<E>) data).compareTo(root.data) == 0) {

            return true;
        }
        if (((Comparable<E>) data).compareTo(root.data) > 0) {
            return contains(data, root.right);
        }

        return contains(data, root.left);

    }


    public void showRootElements() {
        System.out.println(space(size) + root.data);
        System.out.print("  " + '/');
        System.out.println(" " + '\\');
        System.out.print(" " + root.left.data);
        System.out.println("   " + root.right.data);


    }

    public E delete(E data) {
        return delete(data, root);
    }

    private E delete(E data, Node node) {
        E temp;
        Node tempNode;
        if (node == null) {
            return null;
        }
        if (node.right == null) {
            tempNode = findAndDelete(data, node.left);
            temp = tempNode.data;
            tempNode = null;
            return temp;
        }
        if (node.left == null) {
            tempNode = findAndDelete(data, node.right);
            temp = tempNode.data;
            tempNode = null;
            return temp;
        } else
            return null;
    }

    private Node findAndDelete(E data, Node root) {
        if (root == null) {
            return null;
        }
        if (((Comparable<E>) data).compareTo(root.data) == 0) {

            return root;
        }
        if (((Comparable<E>) data).compareTo(root.data) > 0) {
            return findAndDelete(data, root.right);
        }

        return findAndDelete(data, root.left);

    }

    public Node rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        return temp;

    }


    public Node rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;

    }

    public Node rotateRightleft(Node node){
node.right=rotateRight(node.right);
return rotateLeft(node);

    }
    public Node rotateLeftRight(Node node){
        node.left=rotateLeft(node.left);
        return rotateRight(node);

    }
    private String space(int no) {
        String temp = "";
        for (int i = 1; i <= no; i++) {
            temp += " ";
        }
        return temp;
    }

    public int getSize() {
        return size;
    }

}
