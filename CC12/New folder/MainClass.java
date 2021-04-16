


class MainClass{
	public static void mani(String[] args)
	{
		OurStack obj = new OurStack(); //arg the size of the stack
		
		stack.push(50);
		stack.push(12);
		stack.push(40);
		stack.push(70);
		stack.push(80);
		
		System.out.println(stack.size()); //=>5 output
		stack.print(); // => 50->12->40->70->80 
		
		System.out.println(stack.pop()); //=> 80
		System.out.println(stack.pop()); //=> 70
		System.out.println(stack.size()); // 3
		stack.print(); // => 50->12->40 
		
		System.out.println(stack.pop()); //=> 40
		System.out.println(stack.pop()); //=> 12
		System.out.println(stack.pop()); //=> 50
		System.out.println(stack.pop()); //=> empty should not be allowed
		
	}
}