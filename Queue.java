//Queue using Array
import java.util.*;
class LinearQueue
{

	int ar[]=new int[5];
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
	boolean overflow() //if the size exceeds the max capacity of the queue || r>ar.lenth || r==size-1
	{
		if(r>=4)//?
			return true;
		else
			return false;
	}

	void add(int num) //r++, add a new element at r, i++, (i is size), check overflow => Not possible, if (underflow) is true for the 6th case as well, because of which out of bound error
	{
		
		 if(overflow())
		{
			System.out.println("Cannot add new elements\nOverflow");

		}
		else
		{
			if((f==-1)&&(r==-1))
			{
				f++; 
				r++;
				ar[r]=num;
				i++;
				print();
			}
			else
			{
				r++;
				ar[r]=num;
				i++;
			
				print();
			}
		}
		
		

	}
	void remove()//remove the first element FIFO, ar[f]- remove, f++, check underflow
	{
		if(!underflow())
		{
			//++f;
			f++; //to delete elements
			if(f>r) //when f becomes 5, which means no more lements to delete, underflow will be true
			{
				f=-1;
				r=-1;
			}
			else
			{
				print();
			}
		}
		else
		{
			System.out.println("No more elements to delete");
		}
	}
	void print()
	{
		for(i=f;i<=r;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

}
class Queue
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		LinearQueue q=new LinearQueue();
		for(int j=0;j<n;j++)
			q.add(a[j]);
		q.add(66);
		for(int j=0;j<n;j++)

		q.remove();

		

	}
}
