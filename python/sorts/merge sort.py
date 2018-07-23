def mergesort(S):
 n = len(S) 
 if n <2:
     return
 
 mid = n // 2
 S1 = S[0:mid] 
 S2 = S[mid:n] 
 print(S1,S2)

 mergesort(S1) 
 mergesort(S2) 
 merge(S1, S2, S)




def merge(S1, S2, S):
  i = j = 0
  while i + j < len(S):
   if j == len(S2) or (i < len(S1) and S1[i] < S2[j]):
    S[i+j]= S1[i] 
    i += 1
   else:
    S[i+j] = S2[j] 
    j += 1


list=[3,55,10,5,2,1,0]
mergesort(list)
# print(list)   