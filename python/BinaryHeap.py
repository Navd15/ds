class heap:
    N=0 #list starts at index 1
    
    def __init__(self,num):
       heap.list=[None]*num


    def insert(self,element):
        if heap.N==len(heap.list)-1:
            print("Overflowed")
            return
        
        heap.N+=1
        heap.list[heap.N]=element
        self.__swim(heap.N)

    def pr(self):
        print(heap.list)

    def delMax(self):
      print(heap.list[heap.N])
      self.__swap(1,heap.N)
      heap.list[heap.N]=None
      heap.N-=1
      print(heap.N)
      self.__sink(1)  
      

    def __swim(self,key):
      
       while(key>1 and heap.list[int(key/2)]<heap.list[key] ):
          self.__swap(int(key/2),key)
          key=int(key/2)           



    def __sink(self,key):
        while(2*key<=heap.N):
          child=2*key 
          if child<heap.N  and heap.list[child]<heap.list[child+1]:
             child=child+1
          if heap.list[child]<heap.list[key]:
             break           
          self.__swap(key,child)
          key=child
        


    def __swap(self,left,right):
        temp=heap.list[left]
        heap.list[left]=heap.list[right]
        heap.list[right]=temp



he=heap(5)
he.insert(9)
he.insert(1)
he.insert(3)
he.insert(11)
he.delMax()
he.pr()




