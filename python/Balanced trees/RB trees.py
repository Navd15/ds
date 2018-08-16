# Rules for red black trees 
# --> They need to be checked for each insertion
#0 Each node is either red or black
#1 New nodes are Red in color
#2 Root node is always black
#3 Null nodes are considered black 
#4 No consecutive red nodes are allowed
#5 N.o of black nodes shuld be equal from root to null nodes
class Tree:

	__size=0 
	__root=None
    class __Node:
        __Red=True
        __Black=False      

		def __init__(self,key,value,color=True):
		   self.key=key
           self.rightChild=None
           self.leftChild=None
           self.value=value
           self.color=color


    def __isRed(self,node):
        if node==None:
            return False
        return True
    
    
    def Insert(self,key,value):
        if Tree.__root=None:
           return Tree.__root=Tree.__Node(key,value,False)
        return Tree.__insertNode(key,value )

    def __insertNode(self,key,value):


    

    
