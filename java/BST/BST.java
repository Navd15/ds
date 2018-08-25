class BST<K,V> {
private Node<K,V> root=null;

 BST(K key,V val){
 put(key,val);
 }


 private class Node<K,V> {
 private K key;
 private V value;
private int count;
 private Node<K, V> rightChild = null;
 private Node<K, V> leftChild = null;

  Node(K key, V value) {
   this.key = key;
   this.value = value;
   count = 1;

  }
 }

 public int size(){
return size(root);

 }
public void c(){

    System.out.println(root.count);
}

public void put(K key,V value){

root=put(root, key, value);
}


public Object r(){
    return root.rightChild.key;
}
public int rank(K key){

    return rank(root,key);
}

public K max(){return max(root);
}
public K min(){
return min(root);

}
/* ============================== */
private int rank(Node node,K key)
{
if (node==null) return 0;
int cmp=((Comparable <K>)(key)).compareTo((K)node.key);

if(cmp<0)
    return rank(node.leftChild,key);

    else if(cmp>0)

    return 1+size(node.leftChild)+rank(node.rightChild,key);
else{
return size(node.leftChild);
}
}

private K max(Node node){
    if(node.rightChild==null){
        return (K)node.key;
    }
    return max(node.rightChild);
}


private K min(Node node){
if(node.leftChild==null)
return (K)node.key;
else
return min(node.leftChild);


}
private Node put(Node<K,V> node,K key,V value){
 if(node==null){ 
 return  new Node(key,value);
}
 int cmp=((Comparable <K>)key).compareTo(node.key);
 if(cmp>0){
 node.rightChild=put(node.rightChild, key, value);
 }
 else
{ node.leftChild=put(node.leftChild, key, value);
}

node.count=1+size(node.leftChild)+size(node.rightChild);
return node;
}

private int size(Node node){
if(node==null){
return 0;}
return node.count;

}


}