
/* Linear Probing Hashtable */


class LinearProb<Key ,Value >{
private int m=1000;
Value[] values=(Value[]) new Object[m];
Key[] keys=(Key[]) new Object[m];

private int hash(Key k){

return (k.hashCode() & 0x7fffffff)%m;

}

public void put(Key k ,Value v) {
int i;

for(i=hash(k);keys[i]!=null;i=(i+1)%m){

if(k.equals(keys[i])){
System.out.println("in if");
break;
}
else
keys[i]=k;
values[i]=v;

 }

}

public Value get(Key k){
    Value v=null;
    int i=0;
    
    for(i=hash(k);keys[i]!=null;i=(i+1)%m)
    {
if(keys[i].equals(k)){
v=values[i];
break;

    }
      
}
return v;  

}



}

class hashtable{
public static void main(String[] args){

LinearProb<Integer,Character> k= new LinearProb();

k.put(1, 'R');
System.out.println(k.get(1));
}
}
