import time

class shell:
    num=[9,8,7,6,5,4,54,25,6,78,93,2,1,9,0]
    length=len(num) 
            
    def sort(self):
     gap=int(shell.length/2)
     while(gap>0):
         for i in range(gap,shell.length):
             
             if shell.num[i]<shell.num[i-gap]:
                  self.__swap(i,i-gap)
                  
                  for j in range(i-gap,gap-1,-gap):
                       if shell.num[j]<shell.num[j-gap]:
                        self.__swap(j,j-gap)
                       else:
                            pass

             else:
                 pass

         gap=int(gap/2)          

            

        
  

    def __swap(self,left,right):
      temp=shell.num[left]
      shell.num[left]=shell.num[right]
      shell.num[right]=temp


q=shell()
q.sort()
print(shell.num)
