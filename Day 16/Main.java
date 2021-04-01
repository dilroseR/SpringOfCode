// Reverse the elements of a queue

import java.util.*;
class Main{
	public static void main(String args[])
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		
		int n=0,ele=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n=sc.nextInt();
		ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");	
			ele=sc.nextInt();
			queue.add(ele);
		}
		
		
		while(!queue.isEmpty())
		{
			ele=queue.remove();
			stack.push(ele);
		}
		
		
		System.out.print(stack);
	}

}