import java.util.Arrays;

class ArrayList<E> 
{
    private static final int INITIAL_CAPACITY = 10;//initial max capacity
    private int size = 0; //size
    private Object elementData[] = {}; //array to hold data

    //constructor of custom ArrayList
    public ArrayList() 
	{
        elementData = new Object[INITIAL_CAPACITY];
    }

	//Method increases capacity of list by making it double.
    private void ensureCapacity() 
	{
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    public void add(E e) //method adds elements in ArrayList
	{
        if (size == elementData.length) 
		{
			ensureCapacity(); // increase current capacity of list by doubling it.
        }
		elementData[size++] = e; //input new data into array at position size + 1
    }
 
    @SuppressWarnings("unchecked") //suppresses warnings for unchecked or unsafe operations used
    public E get(int index) // method returns element on specific index.
	{
           
        if (index < 0 || index >= size) // if index is negative or greater than size of size, we throw Exception.
		   {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
           return (E) elementData[index]; // return value on index.
    }

	public int size() //method returns the size of the array list
	{
      return size;  
	}
 
}