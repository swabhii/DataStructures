import java.util.*;

class Stack
{
	static Node top=null;

	static class Node 
	{
	int data;
	Node next;
	
	Node(int d)
	{
		this.data=d;
	}

	}

	public static Stack push(Stack l,int d)
	{
		Node newnode=new Node(d);
		newnode.data=d;
		newnode.next=l.top;
		l.top=newnode;
		return l;

	}

	public static Stack pop(Stack l)
	{
		if(l.top==null)
			System.out.println("Stack is empty");
		else
		{
			
		}
		
	}

	public static Stack peek(Stack l)
	{
		
	}

	public static  boolean isEmpty(Stack l)
	{
		if(l.top==null)
			return true;
		else
			return false;
	}

	public static  boolean isFull(Stack l)
	{
		
	}


	public static void print(Stack l)
	{
		Node ptr=l.top;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
	}
}

class StackLL
{
	public static void main(String[] args) {
		Stack s=new Stack();


		
	}
}