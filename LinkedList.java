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


}

class LinkedList
{
	public static void main(String[] args) 
	{
		int d=30;
		LL obj1=new LL();
		
		obj1.insert(obj1,d);
		obj1.printList(obj1);
		
	}
}