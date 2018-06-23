class Stack:
    size = []
    top = 0

    def __init__(self, length):
        Stack.size = [None]*10

    def pop(self):
        popped = Stack.top
        print('Popped :'+popped)

    def push(self, what):
        self.size[self.top+1] = what

    def pr(self):
        print(Stack.size == self.size)


class run:
    def __init__(self, length):
        s = Stack(length)
        s.pr()


r = run(8)
