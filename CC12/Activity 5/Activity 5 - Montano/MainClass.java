/**
  * CC 12 - Activity 5
  * Name: Montano, George Jose P.
  * Date: March 09, 2021
  *
  * Linked list implementation of a queue of integers
  *	Create a queue of integers (enqueue, dequeue, print, and other supporting methods)
  *	To check if your queue is correct, use the following sequence of statements in your main method
  */
class MainClass 
{
  public static void main(String[] args) 
  {
    OurListQueue queue = new OurListQueue();    
	
	queue.enqueue(5);
	queue.enqueue(6);
	queue.enqueue(53);
	queue.enqueue(1);

	queue.print();      // print all elements from the front to the rear
						// ==> 5 => 6 => 53 => 1
	queue.dequeue();    // print the dequeued int
						// ==> 5
	queue.dequeue();    // ==> 6

	queue.print();      // ==> 53 => 1
	queue.enqueue(8);
	queue.print();      // ==> 53 => 1 => 8
	queue.enqueue(1);
	queue.print();      // ==> 53 => 1 => 8 => 1
	queue.dequeue();	// ==> 53
	queue.dequeue();	// ==> 1
	queue.dequeue();	// ==> 8
	queue.dequeue();	// ==> 1
	queue.dequeue();	// The List is Empty
	queue.print();		// The List is Empty
    
  }
}
