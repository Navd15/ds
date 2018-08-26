class runner{
public static void main(String[] args){
BST  bst=new BST('A',3);
bst.put('C', 4);
bst.put('F', 18);
// for (Object var :bst.keys()) {
//     System.out.println(var);
// }
System.out.println(bst.get('F'));  


}
}