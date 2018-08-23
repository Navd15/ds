class BST <K,V> {
private Node root=null;

 BST(K key,V val){    
put(key,val);
 }


 private class Node<K,V>{
K key;
V value;
int count;
Node<K,V> rightChild=null;
Node<K,V> leftChild=null;

 Node(K key, V value){
this.key=key;
this.value=value;
this.count=1;

 }

public Node<K,V> put(K key,V value){
return put(root, key, value);
}

public Node<K,V> r(){
    return root;
}

private Node put(Node node,K key,V value){
if(node==null)
node=new Node(key, value);
return node;
K cmp=node.key;
if (key.compareTo(cmp)>0)
return put(node.rightChild, key, value);
return put(node.leftChild,key,value);
}


 }




}