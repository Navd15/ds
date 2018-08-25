class runner{
public static void main(String[] args){
BST  bst=new BST('A',3);
bst.put('C', 4);
bst.put('F', 18);
System.out.println(bst.rank('A'));
 
}
}