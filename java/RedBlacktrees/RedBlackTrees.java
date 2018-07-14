public class RedBlackTrees<K, V> {
    Node<K, V> root;
    int size;

    class Node<K, V> {
        K key;
        V value;
        Node<K, V> left, right, parent;
        boolean isLeft, black;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = right = parent = null;
            isLeft = black = false;
        }
    }

    public RedBlackTrees() {
    }

    public void add(K key, V value) {
        Node<K, V> node = new Node<>(key, value);
        if (root == null) {
            root = node;
            root.black = true;
            size++;
            return;
        }
        add(root, node);

        size++;
    }

    private void add(Node<K, V> parent, Node<K, V> newNode) {
        if (((Comparable<K>) newNode.key).compareTo(parent.key) > 0) {

            if (parent.right == null) {
                parent.right = newNode;
                newNode.parent = parent;
                newNode.isLeft = false;
                return;
            }
            add(parent.right, newNode);
        } else if (parent.left == null) {
            parent.left = newNode;
            newNode.parent = parent;
            newNode.isLeft = true;
            return;
        } else {
            add(parent.left, newNode);
        }

        checkColor(newNode);

    }

    public void checkColor(Node node) {
        if (node.parent == null) {
            return;
        }
        if (!node.black && !node.parent.black) {

            correctTree(node);
        }

        checkColor(node.parent);
    }

    private void correctTree(Node node) {
        if (node.parent.isLeft) {
            //if isLeft is true aunt of node(node.parent.parent) will be a right child
            if (node.parent.parent.right == null || node.parent.parent.right.black) {
//aunt is black
                rotate(node);
                return;
            }

            if (node.parent.parent.right != null) {
                node.parent.parent.right.black = true;
                node.parent.parent.black = false;
                return;
            }

        }
        if (!node.parent.isLeft) {
            //isLeft is false so present node is a left child
            if (node.parent.parent.left == null || node.parent.parent.left.black) {

                rotate(node);
                return;
            }
            if (node.parent.parent.left != null) {
                node.parent.parent.left.black = true;
                node.parent.black = false;
                return;

            }

        }


    }

    private void rotate(Node node) {
        if (node.isLeft) {
            if (node.parent.isLeft) {
                rightRotate(node.parent.parent);
                node.black = false;
                node.parent.black = true;
                if (node.parent.right != null) {
                    node.parent.right.black = false;
                }
                return;
            }
            if (!node.parent.isLeft) {
                rightLeftRotate(node.parent.parent);
                node.black = true;
                node.right.black = false;
                node.left.black = false;
                return;
            }


        }
        if (!node.isLeft) {
            if (!node.parent.isLeft) {
                leftRotate(node.parent.parent);
                node.black = false;
                node.parent.black = true;
                if (node.parent.right != null) {
                    node.parent.right.black = false;
                }
                return;

            }
            if (node.parent.isLeft) {
                leftRightRotate(node.parent.parent);
                node.black = true;
                node.right.black = false;
                node.left.black = false;
                return;


            }

        }
    }

    public void leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        if (node.right != null) {
            node.right.parent = node;
            node.right.isLeft = false;
        }
        if (node.parent == null) {
            //we are root
            root = temp;
            temp.parent = null;
        } else {
            temp.parent = node.parent;
            if (node.isLeft) {
                temp.isLeft = true;
                temp.parent.left = temp;
            } else {
                temp.isLeft = false;
                temp.parent.right = temp;
            }

        }
        temp.left = node;
        node.isLeft = true;
        node.parent = temp;


    }

    public void leftRightRotate(Node node) {
        leftRotate(node.left);
        rightRotate(node);

    }
    public void  rightLeftRotate(Node node){
        rightRotate(node.right);
        leftRotate(node);

    }

    public void rightRotate(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        if (node.left != null) {
            node.left.parent = node;
            node.left.isLeft = true;

        }
        if (node.parent == null) {
            //we are at root
            root = temp;
            root.parent = null;
        } else {
            temp.parent = node.parent;
            if(!node.isLeft){
                temp.isLeft = false;
                temp.parent.right = temp;
                }
            else {
                temp.isLeft = true;
                temp.parent.left = temp;
            }

        }
        temp.right = node;
        node.isLeft = false;
        node.parent = temp;

    }

    public int getHeight(Node node){

       return height(node)-1;
    }

    private int height(Node node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left)+1;
        int rightHeight=height(node.right)+1;
        if(leftHeight>=rightHeight){
            return leftHeight;
        }
        else
            return rightHeight;
    }


    public int blackNodes(Node root)throws Exception{
        if(root==null){
            return 1;
        }
        int rightBlack=blackNodes(root.right);
        int leftBlack=blackNodes(root.left);
if(rightBlack!=leftBlack){
    throw new Exception("Black nodes not equal");


}if(root.black){
    leftBlack++;
        }
return leftBlack;

    }

}
