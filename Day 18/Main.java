// Reverse the first k elements of a queue

import java.util.*;
class Main{
	public static void main(String args[])
	{
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<Integer> queue2=new LinkedList<Integer>();
		ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
		int n=0,ele=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n=sc.nextInt();
		System.out.println("Enter k: ");
		k=sc.nextInt();

		for(int i=0;i<k;i++)
		{
			System.out.println("Enter the element: ");	
			ele=sc.nextInt();
			queue1.add(ele);
		}

		for(int i=0;i<n-k;i++)
		{
			System.out.println("Enter the element: ");	
			ele=sc.nextInt();
			queue2.add(ele);
		}

		while(!queue1.isEmpty())
		{	
			ele=queue1.remove();
			stack.push(ele);
		
		}

		while(!stack.isEmpty())
		{	
			ele=stack.remove();
			queue1.add(ele);
		
		}

		while(!queue2.isEmpty())
		{	
			ele=queue2.remove();
			queue1.add(ele);
		
		}
		
		System.out.println(queue1);
		
	}

}