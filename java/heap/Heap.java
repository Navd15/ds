public class Heap<E> {
   private int lastpostition=-1;
   private int size;
   E[] array;


    public Heap(int size) {
        this.size = size;
       array= (E[]) new Object[size];

    }

    public void add(E data){

       // System.out.println(array[1]);

array[++lastpostition]=data;

trickleUp(lastpostition);
        System.out.println(array[2]);

    }

    public E  remove(){
       E temp=array[0];
       swap(0,lastpostition--);
       return temp;
    }

    private void swap(int from,int to){
        E temp=array[from];
        array[from]=array[to];
        array[to]=temp;
    }
    private void trickleUp(int position){
        if(position==0)
            return;
        int parent=(int)Math.floor((position-1)/2);
        if(((Comparable<E>) array[position]).compareTo(array[parent])>0)
swap(position,parent);
        trickleUp(parent);

    }

    private void trickleDown(int root){
int left=(2*root)+1;
int right=(2*root)+2;

if(left==lastpostition && ((Comparable<E>)array[root]).compareTo(array[left])<0){

    swap(root,left);
    return;
}
if(right==lastpostition&&  ((Comparable<E>)array[root]).compareTo(array[right])<0){
    swap(root,right);
    return;
}
if(left>=lastpostition||right>=lastpostition){
    return;
}
if( ((Comparable<E>)array[left]).compareTo(array[right])>0&& ((Comparable<E>)array[root]).compareTo(array[left])<0){
swap(root,left);
trickleDown(left);
}else if(((Comparable<E>)array[right]).compareTo(array[left])>0&& ((Comparable<E>)array[root]).compareTo(array[right])<0){
    swap(root,right);
    trickleDown(right);
}

    }
}
