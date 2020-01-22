//Circular Queue using Array
import java.util.*;
class CircularQueue
{

	int ar[]=new int[10];
	int f=-1;
	int r=-1;
	int i=0;
	boolean underflow()
	{
		if((f==-1))
			return true;
		else if(f>=r)
			return true;
		else
			return false;
	}
	boolean overflow()
	{
		if(((f==0)&&(r==ar.length-1))||(f==r+1))
		return true;
		else
		return false;
	}

	void add(int num)
	{
		if(overflow())
		{
			System.out.println("Cannot add new elements");
		}
		else
		{
			if(f==-1)
			{
				f=0;
				r=0;
				ar[r]=num;
				//i++;
				print();
			}
			if(r==ar.length-1)
			{
				r=0;
				ar[r]=num;
				//i++;
				print();
			}
			else
			{
				r++;
				ar[r]=num;
				print();			
			}
		}

	}
	void remove()
	{
		if(underflow())
			System.out.println("Nothing to delete");
		 if(f==r)
		 	f=r=-1;
		 else if(f==ar.length-1)
		 	f=0;
		 else
		 	f++;
		 print();
		
	}
	void print()
	{
		for(i=f;i<=r;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.print("\n");
	}

}
class CQueue
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		CircularQueue q=new CircularQueue();
		for(int j=0;j<n;j++)
			q.add(a[j]);
		for(int j=0;j<n;j++)

		q.remove();

		

	}
}