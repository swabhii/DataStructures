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
		newnode.next=null; //Last node
		Node ptr=l.head;
		if(l.head==null)
			l.head=newnode;
		else
		{	ptr=l.head;//ptr is a replica of head
		    while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
		}
			return l;

	}
	public static void printList(LL l)
	{
		Node ptr=l.head;
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
	public static void middle(LL l)
	{
		Node ptr1=l.head;
		Node ptr2=l.head;
		
		while((ptr2.next!=null)&&(ptr2.next.next!=null))
		{
			
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;


		}
		System.out.println("The middle element is "+ptr1.data);

	}



}

class LinkedListMiddle
{
	public static void main(String[] args) 
	{
		int d=30;
		LL obj1=new LL();
		
		obj1.insert(obj1,d);
		
		
		obj1.insert(obj1,40);
		obj1.insert(obj1,50);
		obj1.insert(obj1,60);
		obj1.insert(obj1,70);

		obj1.printList(obj1);

		obj1.count(obj1);
		obj1.middle(obj1);
		
	}
}