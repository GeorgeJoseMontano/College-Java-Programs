/*
Montano, George Jose P.
20190018801
Create a Java program that asks for an integer from the user. Use a method that will determine
whether or not the integer given by the user is narcissistic or not.
*/
import java.util.*;
class NarciTest
{
	int num,length,digit,power,orig,sum=0;
	String s;
	public static void main(String[] args)
	{
		NarciTest obj=new NarciTest();
		obj.inputNum();
		obj.checkNum();
	}
	void inputNum()//user inputs number
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Integer");
		num=sc.nextInt();
		orig=num;
	}
	void checkNum()//number is checked if narcissistic or not
	{
		s=Integer.toString(num);
		length=s.length();//l is value of the string's length
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			power = (int)( Math.pow(digit,length));//covert double number into int + digit is raised to l's value
			sum+=power;
		}
		if(orig==sum)
		System.out.println(orig+" is a Narcissistic number");
		else
		System.out.println(orig+" is not a Narcissistic number");
	}
	
}