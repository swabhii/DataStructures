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
	public static LL delete(LL l,int d)
	{
		Node newnode=l.head;
		Node n=null;
		if(newnode!=null&&newnode.data==d)
		{
			l.head=newnode.next;
			return l;
		}
		else
		{
			while(newnode!=null&&newnode.data!=d)
			{
				n=newnode;
				newnode=newnode.next;
			}
					if(newnode==null)
						return l;
					else
						n.next=newnode.next;
			}
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

class LinkedListDeleteKValue
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
		System.out.println("Enter the value to delete");
		int num=s.nextInt();
		obj.delete(obj,num);
		System.out.println("Now the list is\n");
		obj.printList(obj);
		
	}
}