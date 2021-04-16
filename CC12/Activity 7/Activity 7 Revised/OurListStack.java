
class OurListStack
{
	class Node
	{
		String data;
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
    
    public void push(String x)
    {
        Node temp = new Node();
        temp.data = x;
		temp.next = top;
        top = temp;
        size++ ;
    }    
    // String pop()
    public String pop()
    {
        if (isEmpty() )
		{
           System.out.println("The Stack is Empty.");
		   return null;
		}
		else
		{
			Node temp = new Node();
			temp = top;
			top = temp.next;
			size-- ;
			return temp.data;
		}
    }    
}
/*  Class Node  */

