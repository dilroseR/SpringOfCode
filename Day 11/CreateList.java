//Remove all Fibonacci Nodes from a Circular Singly Linked list
import java.util.*;

public class CreateList{
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
			{
				this.data=data;	
			}
	}

public Node head=null;
public Node tail=null;

public void add(int data){

	Node new_node=new Node(data);
	if(head==null)
	{
		head=new_node;
		tail=new_node;
		new_node.next=head;
	}
	else
	{
		tail.next=new_node;
		tail=new_node;
		tail.next=head;	
	
	}
	
}

public void display(){

Node current=head;
int[] arr=new int[]{ 1,1,2,3,5,8,13,21,34,55,89};
int num=0;


if(head==null)
	System.out.print("List is empty");
else
{
	do
	{
		num=current.data;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				current=current.next;
		}
		System.out.print(current.data + " ");
		current=current.next;

	}while(current!=head);

	System.out.print(" ");
}
}

	public static void main(String args[])
	{
		CreateList l=new CreateList();
		l.add(9);
		l.add(11);
		l.add(34);
		l.add(6);
		l.add(13);
		l.add(20);
		
		l.display();
	}
}
