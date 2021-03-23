//Sum & Product of the nodes of a circular singly linked list which are divisible by k
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

public void display(int k){
int i=0;
Node current=head;
int[] arr=new int[20];
int num=0,sum=0,mul=1;


if(head==null)
	System.out.print("List is empty");
else
{
	do
	{
		num=current.data;
		if(num%k==0)
		{
			sum=sum+num;
			mul=mul*num;
			
		}
		current=current.next;
	}while(current!=head);
	
		System.out.println("SUM: "+ sum);
		System.out.print("PRODUCT: "+ mul);

	System.out.print(" ");
}
}

	public static void main(String args[])
	{
		int k=0;
		Scanner sc=new Scanner(System.in);
		CreateList l=new CreateList();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(11);

		System.out.print("Enter k: ");
		k=sc.nextInt();
		l.display(k);
	}
}
