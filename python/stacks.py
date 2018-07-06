class Stack:
    size = []
    top = -1
    length=0

    def __init__(self, length):
        self.length=length
        self.size = [None]*self.length
    def pop(self):
        if(self.top==-1):
            print("Already Empty")
        else:
         popped = self.size[self.top]
         print('Popped :'+ str(popped))
         self.size[self.top]=None
         
         self.top=self.top-1

    def push(self, what):
        if(self.top>=self.length-1):
         print("Stack already filled")
        else:
         self.top=self.top+1  
         self.size[self.top] = what
         
        

    def show(self):
        print(self.size)

# Entry point for Stack

class run:
    
    def __init__(self, length):     
     self.s = Stack(length)
     

no=int(input("Enter stack length: "))
r=run(no)

