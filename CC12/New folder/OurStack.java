class OurStack
{
	int[] data;
	int index; // index current location of the last input if it exists, else -1
				// cannot use negative numbers on index
	int size;
	
	//constructor
	//@param int size of the array stack
	public OurStack(int size)
	{
		this.size = size; //size above receives value of size below
		data = new int[this.size];
		this.index = -1; // -1 because nothing inside yet		
	}
	
	//check if the stack is full
	//@return boolean, true if stack is full, false if otherwise
	public boolen isFull()
	{
		if(this.size == this.index) //to be verified
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//push add element into the stack
	//@param int the value to be added
	public void push (int value)
	{
		//check if the stack is full?
		if(isFull())
		{
			System.out.println("The Stack is Full.");
		}
		else
		{
		//this.index++; location of the ++ matters
		this.data[this.index] = value; //++ same as above
		}
	}
	
	//retruns the current size of the stack
	//@return in the size of the stack
	public int size()
	{
		if(this.index == -1)
		{
			return 0;
		}
		else
		{
		return this.index + 1; ==> to be verified
		}
		
	}
	
	//print the contents of the stack
	
	public void print()
	{
		for(int ctr=0;ctr<=this.index;ctr++)
		{
			System.out.print(this.data[ctr]+"-->");
		}
	}
	
	//check if the stack is empty
	//@return a boolean if the stack is empty, otherwise false
	public boolean isEmpty()
	{
		if(this.index==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//returns the last inputted integer from the stack
	public int pop()
	{
		//check first if the stack is empty
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			//this
			int temp = this.data[this.index];
			this.index--;
			return temp;
			//or
			//return this.data[this.index--];	
		}
	}
}