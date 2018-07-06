class queue:
    DEFAULT_SIZE=10

    def__init__(self):
     self._data=None*queue.DEFAULT_SIZE
     self._size=0
     self._front=0

    def__len__(self):
        return self._size

    def is_empty(self):
        return self._size==0

    def first(self):

        if self.is_empty()
          raise Empty('Queue is Empty')

        return self._data[self._front]


    def dequeue(self)
     f self.is empty(): 
     raise Empty( Queue is empty )
 
      answer = self. data[self. front]
      self. data[self. front] = None # help garbage collection
      self. front = (self. front + 1) % len(self. data)
      self. size −= 1       
      return answer




