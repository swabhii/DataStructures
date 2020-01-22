import java.util.*;
class Ques21
{
	public static void fibonacci(int f,int l,int count)
	{
		int s=f+l;
		System.out.print(" "s+" ");
		count++;
		if(count==10)
			return;
		else
			fibonacci(l,s,count);
		
	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("1 1");
		fibonacci(1,1,0);
	}
}