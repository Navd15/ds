class LinkedQueue:

class Node: 
 self. head = None
 self. tail = None
 self. size = 0 # number of queue elements

 def len (self):

  return self. size

 def is empty(self):

  return self. size == 0

 def first(self):

  if self.is empty():
   raise Empty( Queue is empty )
   return self. head. element 

 def dequeue(self):

  if self.is empty():
   raise Empty( Queue is empty )
   answer = self. head. element
   self. head = self. head. next
   self. size −= 1

  if self.is empty(): # special case as queue is empty
   self. tail = None # removed head had been the tail
   return answer

 def enqueue(self, e):
 
  newest = self. Node(e, None) # node will be new tail node
  if self.is empty():
  self. head = newest # special case: previously empty
  else:
  self. tail. next = newest
  self. tail = newest # update reference to tail node
  self. size += 1