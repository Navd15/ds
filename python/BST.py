class ST:
    __size=0
    __root=None
    class __Node:

       def __init__(self,key,value):
           self.key=key
           self.value=value
           self.leftChild=None
           self.rightChild=None    

    def __init__(self,key,value):
        if ST.__root==None:
            ST.__root=ST.__Node(key,value)
            ST.__size+=1
    

    def size(self):
        return ST.__size

    def put(self,key,value):
        if ST.__root!=None:
           self.__add(ST.__root,key,value)
           ST.__size+=1
        else:
         ST.__root=ST.__Node(key,value)   


    def r(self):
        return ST.__root       
            


    def __add(self,root,key,value):
            cmp=root.key
            if key>cmp:
                if root.rightChild==None:
                    root.rightChild=ST.__Node(key,value)
                    return
                else:
                   self.__add(root.rightChild,key,value)
            else:
                if root.leftChild==None:
                    root.leftChild=ST.__Node(key,value)
                    return
                else:
                   self.__add(root.leftChild,key,value)    


    def contains(self,key):
        if ST.__size==0:
             return "Tree is empty"

        return self.__search(ST.__root,key) 

    def __search(self,root,key):
        if root==None:
          return "Not found"

        if key==root.key:
              return root.value

        if key<root.key:
           return self.__search(root.leftChild,key)            

        if key>root.key:
            return  self.__search(root.rightChild,key)    




s=ST("A",6)
s.put("E",3)
s.put("C",8)
s.put("B",0)

print(s.contains("R"))



