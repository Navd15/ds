class BubbleSort:
 num=[20,6,1,5,3,9,0,3,4,3,383,383,34]
   
 def sort(self):
  for i in BubbleSort.num:
      for j in range(0,len(BubbleSort.num)-1):
          if BubbleSort.num[j]>BubbleSort.num[j+1]:
            #   selswap(j,j+1)
            self.__swap(j,j+1)
          else:
            pass
              
    



 def __swap(self,left,right):
    temp=BubbleSort.num[left]
    BubbleSort.num[left]=BubbleSort.num[right]
    BubbleSort.num[right]=temp

q= BubbleSort()
q.sort()
print(BubbleSort.num)