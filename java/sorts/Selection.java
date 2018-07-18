class Selection{
int ar[]={1,2,31,3,55,3,4,5,6,22,4};
 public void sort(){

  for(int i=0;i<ar.length;i++){
    for(int j=i;j<ar.length;j++){
    if (ar[i]>ar[j]){

        swap(i,j);

    }

    }


  }


 }


private void swap(int left,int right){
int temp=ar[left];
ar[left]=ar[right];
ar[right]=temp;
}

public void pr(){
for(int i :ar){

    System.out.println(i);
}

}

public static void main(String args[]){
Selection s=new Selection();
s.sort();
s.pr();


}

}