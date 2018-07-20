# h-sorting array

class Inst:
    num=[34,5,315,3,9,34,6,66]
#[34,9,3....]
#[34,3,9]
    def sort(self):
        for i in range(1,len(Inst.num)):
          if Inst.num[i]<Inst.num[i-1]:
             self.__swap(i,i-1)
             for j in range(i-1,0,-1):
               if Inst.num[j]<Inst.num[j-1]:
                 self.__swap(j,j-1)
               else:
                 pass
               

          else:
              pass 




    # def pri(self):
    #     print(Inst.num)
      




    def __swap(self,left,right):
      temp=Inst.num[left]
      Inst.num[left]=Inst.num[right]
      Inst.num[right]=temp

   

q=Inst()
q.sort()
print(Inst.num)



