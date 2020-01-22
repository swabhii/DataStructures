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
	Node()
	{

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
	public static LL insertPos(LL l,int num,int pos)//will return a linkedlist (LL)
	{
		Node newnode=new Node(num);
		int count=0;
		Node ptr=l.head;
		while(ptr!=null)
	{
		ptr=ptr.next;
		count++;
		if(count==pos-1)
			break;
	}
	
	//ptr=newnode;
	newnode.next=ptr.next;
	ptr.next=newnode;
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
	



}

class LinkedListPosK
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
		System.out.println("The linkedlist is\n");
		obj.printList(obj);

		int num=s.nextInt();
		int pos=s.nextInt();

		obj.insertPos(obj,num,pos);
		System.out.println("The linkedlist now is\n");
		obj.printList(obj);



		
	}
}