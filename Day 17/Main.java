// Interleave the first half of the queue with second half

import java.util.*;
class Main{
	public static void main(String args[])
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<Integer> queue_final=new LinkedList<Integer>();
		int n=0,ele=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");	
			ele=sc.nextInt();
			queue.add(ele);
		}
		
		for(int i=0;i<n/2;i++)
		{
			ele=queue.remove();
			queue1.add(ele);
		}
		
		
		for(int i=0;i<n/2;i++)
		{
			ele=queue1.remove();
			queue_final.add(ele);
			ele=queue.remove();
			queue_final.add(ele);

		}
		System.out.println(queue_final);
	}

}