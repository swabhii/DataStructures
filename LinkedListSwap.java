import java.util.*;
 class LL
{
	static Node head=null;

	static class Node //does not belong to any objects, only 1 copy
	{
	int data;//data
	Node next;//refernce to next of "Node type"
	
	Node(int d)//to initialise data
	{
		this.data=d;
	}

	}

	public static LL insert(LL l,int d)//will return a linkedlist (LL)
	{
		Node newnode=new Node(d);//object
		newnode.data=d;
		newnode.next=l.head;
		l.head=newnode;
		return l;


		

	}

	public static LL swap(LL l)
	{
		Node ptr=l.head;
		Node ptr2=l.head;
		
		while(ptr.next!=null)
		{
			ptr=ptr.next;

		}
		int temp=ptr.data;
		ptr.data=ptr2.data;
		ptr2.data=temp;
		return l;

	}
	
	public static void printList(LL l)
	{
		Node ptr=l.head;
		System.out.println("The linkedlist is");
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
	}
	public static void count(LL l)
	{
		Node ptr=l.head;
		int c=0;
		while(ptr!=null)
		{
			c++;
			ptr=ptr.next;

		}
		System.out.println("Number of nodes is "+c);

	}
	



}

class LinkedListSwap
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		LL obj=new LL();

		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			obj.insert(obj,ar[i]);
		}

		obj.printList(obj);
		
		obj.swap(obj);
		System.out.println("After Swapping the list is");
		obj.printList(obj);
		
	}
}