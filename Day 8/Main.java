//Merge a linked list into another linked list

/*
Given 2 linked lists, insert nodes of the second linked list into the first linked list at alternate positions
*/

import java.util.*;

class Main{
	public static void main(String args[])
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		LinkedList<Integer> bl=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		String st="";
		int a=0,b=0;

		System.out.println("Enter the no. of elements in the 1st linked list: ");
		int n=sc.nextInt();

		System.out.println("Enter the no. of elements in the 2nd linked list: ");
		int n1=sc.nextInt();
		int[] arr=new int[n+n1];
		int ele=0,val=0;

		System.out.print("Enter the elements of 1st linked list: ");
		for(int i=0;i<n;i++)
		{
			ele=sc.nextInt();
			al.add(ele);
		}
		System.out.print("Enter the elements of 2nd linked list: ");
		for(int i=0;i<n1;i++)
		{
			ele=sc.nextInt();
			bl.add(ele);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				{
					arr[i]=al.get(a);
					a+=1;
					
				}
			else
				{
					arr[i]=bl.get(b);
					b+=1;
					
				}
			
		}

		for(int i=0;i<arr.length;i++)
		{
			val=arr[i];
			if(i==(arr.length-1))
			
				st=st+val;
			
			else
				st=st+val+" =>";
			
		}
		System.out.println(st);	
	

	}
}
