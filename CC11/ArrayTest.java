class ArrayTest 
{
	public static void main(String args[]){
		String[] names;
		names = new String[10];
	
		for (int i=0; i<names.length; i++)
		{
			names[i] = " ";
		}
		names[0] = "Jessie";
		names[5] = "John";
		for (int i=0; i<names.length; i++)
		{
			System.out.println (names[i]);
		}
	}
}