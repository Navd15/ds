class quick:
    def sort(self,list,lo,hi):
        if lo>=hi:
          return
    
        high=lo   
        piv=hi

        for j in range(lo,piv):

            if  list[j]<=list[piv]:
                self.__swap(list,j,high                                )
                high=high+1
                j=j+1
                    
       
        self.__swap(list,high,piv)
        piv=high
        self.sort(list,lo,piv-1)
        self.sort(list,piv+1,hi)
            

    def __swap(self,list,left,right):
        temp=list[left]
        list[left]=list[right]
        list[right]=temp



q=quick()
li=[7,58,43,722,5,54,1,2,8,6000,0,0,7,8,7,2,2,41,7]
q.sort(li,0,len(li)-1)
print(li)
