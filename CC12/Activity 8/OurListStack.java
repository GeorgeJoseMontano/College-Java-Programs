/*
	Montano, George Jose P.
	20190018801

	CC 12 B
	Activity 8

	This is my own Stack implementation created for Activity 6. Replaced int/String with char for Activity 8
*/
class OurListStack
{
	class Node
	{
		char data;
		Node next;
	}
 
    Node top = null;
    int size = 0;
 
    // constructor
    public OurListStack()
    {
        top = null;
        size = 0;
    }    
    
	// check if stack is empty
    public boolean isEmpty()
    {
		if (top == null) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		// or simplified as return top == null;
    }    
    
    public void push(char x)
    {
        Node temp = new Node();
        temp.data = x;
		temp.next = top;
        top = temp;
        size++ ;
    }    
    // char pop()
    public char pop()
    {

			Node temp = new Node();
			temp = top;
			top = temp.next;
			size-- ;
			return temp.data;
    }    
}
/*  Class Node  */

