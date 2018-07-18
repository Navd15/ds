class sel:
 num=[4,1,5,1,2,4,7,88,1,3,2,44,7,90]
 def sort(self):

        for i in range(0,len(sel.num)-1):
            for j in range(i+1,len(sel.num)):
                if sel.num[i]>sel.num[j]:
                    self.__swap(i,j)
                else:
                 pass


 def __swap(self,left,right):
      temp=sel.num[left]
      sel.num[left]=sel.num[right]
      sel.num[right]=temp



q=sel()
q.sort()
print(sel.num)