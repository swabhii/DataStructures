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
	public static void printList(LL l,int c)
	{
		int a=0;
		Node ptr=l.head;
		Node ptr2=l.head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
		while(a!=c/2)
		{
			
			a++;
			ptr2=ptr2.next;
		}
		System.out.println("The mid element is "+ptr2.data);
	}
	public static int count(LL l)
	{
		Node ptr=l.head;
		int c=0;
		while(ptr!=null)
		{
			c++;
			ptr=ptr.next;

		}
		System.out.println("Number of nodes is "+c);
		return c;

	}


}

class LinkedListMid
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

		//obj1.printList(obj1);

		int c=obj1.count(obj1);
		obj1.printList(obj1,c);
	}
}