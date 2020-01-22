import java.util.*;

class linear
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		System.out.println("Enter the number to search");
		int num=s.nextInt();
		int pos=linearSearch(ar,num);
		System.out.println("Your element "+num+" is found at "+pos+" index");


		
	}
	 static int linearSearch(int a[],int num)
	{
		int pos=0;
		int c=0;

		for(int i:a)
		{
			c++;
			if(i==num)
			{
				pos=i;
				break;
			}
			else
				pos=-1;
		}
		return pos;
	}
}