import java.lang.Math;
class merge{


    void sort(int[] a){
     int len=a.length;
  


for(int i=1;i<len;i=i+i){
    for(int lo=0;lo<len-i;lo+=i+i){
     merg(a, lo,lo+i-1,Math.min(lo+i+i-1,len-1));
    }
}
}   

private void merg(int[] a,int lo,int mi,int hi){
 int[] ar=new int[hi+1];
    for(int j=lo;j<=hi;j++){
        ar[j]=a[j];
    }


    // for(int i:ar){                   /*to see intermediate array */
    //     System.out.print(i);
    // }

int low=lo;

int meed=mi+1;

    for(int i=low;i<=hi;i++){
if(low>mi)
a[i]=ar[meed++];
else
if(meed>hi)
a[i]=ar[low++];
else
if(ar[low]>ar[meed]){
a[i]=ar[meed++];
}
else
a[i]=ar[low++];
    
}



}

    public static void main(String[] args){
merge m=new merge();
int [] ar={4,1,2,5,5,3};
m.sort(ar);

for(int i:ar){
    System.out.print(i);
}


    }


}