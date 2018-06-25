class Stack:
    size = []
    top = 0

    def __init__(self, length):
        Stack.size = [None]*length
    def pop(self):
        if(self.top<1):
            print("Already Empty")
        else:
         self.size[self.top]=None
         popped = Stack.top
         print('Popped :'+popped)
         self.top =self.top-1

    def push(self, what):
        if(self.top>9):
         print("Stack already filled")
        else:
         self.size[self.top+1] = what
         self.top=self.top+1  

    def show(self):
        print(self.size)

# Entry point for Stack

class run:
    def __init__(self, length):     
     s = Stack(length)
     s.show()


no=int(input("Enter stack length: "))
r=run(no)