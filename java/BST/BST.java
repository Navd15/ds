import java.util.LinkedList;
import java.util.Queue;

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

public Object get(K key){
    return contains(root, key);
}

public void delete(K key){
  
    root=delete(root, key);

}

public Object r(){
    return root.rightChild.key;
}

public int rank(K key){

    return rank(root,key);
}

public Iterable<K> keys(){
Queue<K> q=new LinkedList<K>() ;
inorder(root,q);

return q;

}
public K max(){return max(root);
}
public Object min(){
return min(root).key;

}
/* ============================== */
private Object contains(Node node,K key){
    if(node==null){
return null;


    }
int cmp=((Comparable <K>)key).compareTo((K)node.key);

    if(cmp==0)
    return node.value;

if(cmp>0){
    return contains(node.rightChild, key);
}
else 
return contains(node.leftChild, key);

}

private void inorder(Node node,Queue q){
if(node==null) return;
inorder(node.leftChild, q);
q.add(node.key);
inorder(node.rightChild, q);

}
private Node deleteMin(Node node){
if(node.leftChild==null) return node.rightChild;
node.leftChild=deleteMin(node.leftChild);
node.count=1+size(node.leftChild)+size(node.rightChild);
return node;

}

private Node delete(Node node,K key){
if(node==null){
return null;
}
int cmp=((Comparable <K>)(key)).compareTo((K)node.key);
if(cmp>0){return node.leftChild=delete(node.leftChild, key);}
if (cmp<0){return node.rightChild=delete(node.rightChild, key);}

/* if we find the node.key==key ie cmp==0 */
else
{                                                                                          
    /* if node has only one child either left or right we return according to it*/

    if(node.rightChild==null){return node.leftChild;} 
 if(node.leftChild==null){return node.rightChild;}

 /* otherwise if both the chidren are present*/
Node x=node;
node=(Node) min(x.rightChild);
node.rightChild=deleteMin(x.rightChild);
node.leftChild=x.leftChild;
}
node.count=1+size(node.leftChild)+size(node.rightChild);

return node;
}

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

 
private Node min(Node node){
if(node.leftChild==null)
return node;
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