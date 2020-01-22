import java.util.*;
class Ques22
{
	public static void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	public static void multiply(int a,int b)
	{
		int m=a*b;
		System.out.println(m);
	}		
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		if(n==1)
		{
			sum(a,b);
		}
		else if(n==2)
		{
			sub(a,b);
		}
		else if(n==3)
		{
			multiply(a,b);
		}
		else
			System.out.println("Invalid Input");
	}
}