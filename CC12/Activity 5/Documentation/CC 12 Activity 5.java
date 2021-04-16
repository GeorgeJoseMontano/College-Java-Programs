CC 12 B

Activity 5 - Linked list implementation of a queue of integers
Create a queue of integers (enqueue, dequeue, print, and other supporting methods)
To check if your queue is correct, use the following sequence of statements in your main method

/******************/
enqueue(5)
enqueue(6)
enqueue(53)
enqueue(1)

print()       // print all elements from the front to the rear
              // ==> 5 => 6 => 53 => 1
dequeue()     // print the dequeued int
              // ==> 5
dequeue()     // ==> 6

print()       // ==> 53 => 1
enqueue(8)
print()       // ==> 53 => 1 => 8
enqueue(1)
print()       // ==> 53 => 1 => 8 => 1

/******************/
