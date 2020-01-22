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
	public static void printList(LL l)
	{
		Node ptr=l.head;
		System.out.println("The Linked List is:");
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
	
	public static void add(LL l1,LL l2)
	{
		
	}


}

class LinkedListAdd
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
		
		int m=s.nextInt();
		int br[]=new int[n];
		LL obj2=new LL();

		for(int i=0;i<m;i++)
		{
			br[i]=s.nextInt();
			obj2.insert(obj2,br[i]);
		}
		obj2.printList(obj2);

		LL obj3=new LL();

		obj3.add(obj,obj2);
		obj3.printList(obj3);

	}
}