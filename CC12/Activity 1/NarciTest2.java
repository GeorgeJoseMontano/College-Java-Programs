import java.util.*;
class NarciTest{
	int n,l,a,p,d,sum=0;
	String s;
	
	void getData()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		d=n;
	}
	void check()
	{
		s=Integer.toString(n);
		l=s.length();
		while(n>0)
		{
			a=n%10;
			n=n/10;
			p= (int)( Math.pow(a,l));
			sum+=p;
		}
		if(d==sum)
		System.out.println("The number is a Narcissistic number");
		else
		System.out.println("The number is not a Narcissistic number");
	}
	public static void main(String[] args)
	{
		NarciTest obj=new NarciTest();
		obj.getData();
		obj.check();
	}
}