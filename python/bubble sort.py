class QuickSort:
 num=[20,6,1,5,3,9,0,3,4,3,383,383,34]
   
 def sort(self):
  for i in QuickSort.num:
      for j in range(0,len(QuickSort.num)-1):
          if QuickSort.num[j]>QuickSort.num[j+1]:
            #   selswap(j,j+1)
            self.__swap(j,j+1)
          else:
            pass
              
    



 def __swap(self,left,right):
    temp=QuickSort.num[left]
    QuickSort.num[left]=QuickSort.num[right]
    QuickSort.num[right]=temp

q= QuickSort()
q.sort()
print(QuickSort.num)