import java.util.*;
class HashingDivision
{
	public static int collision(int num, int[] b, int pos)
	{
		int new_pos=pos+1;
		if(b[new_pos]!=-1)
		{
			collision(num,b,new_pos);
		}
		else if(new_pos>10)
		{
			new_pos=new_pos%10;
			if(b[new_pos]!=-1)
			{
				collision(num,b,new_pos);
			}
			else
				return new_pos;

		}
		else
		{
			//b[new_pos]=num;
			return new_pos;

		}

		return new_pos;


	}

	public static void division(int[] a, int[] b)
	{
		int n=a.length;
		int m=0,r=0;
		int flag=-1;
		
		for(int i=0;i<10;i++)
		{
			b[i]=-1;
		}
		int pos;
		for(int i=n;i>0;i--)
		{
			for(int j=n-1;j>=2;j--)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}

			}
			if(flag==-1)
			{
				m=i;
				break;
			}

		}
		for(int i=0;i<n;i++)
		{
			pos=a[i]%m;
			//b[pos]=a[i];
			if(b[pos]!=-1)
				b[pos]=a[i];
			else
				 r=collision(a[i],b,pos);
				b[r]=a[i];
			
		}

	}


	public static void main(String[] args) {


	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int ar[]=new int[n];
	int b[]=new int[10];
	for(int i=0;i<n;i++)
	{

		ar[i]=s.nextInt();
	}
		division(ar,b);
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}