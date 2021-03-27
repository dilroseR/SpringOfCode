//Sorting an array using Stacks

import java.util.*;
class Main{
	public static void main(String args[])
		{
			ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
			ArrayDeque<Integer> tempstk=new ArrayDeque<Integer>();
			Scanner sc=new Scanner(System.in);
			int ele=0,temp=0;
			System.out.println("Enter the no of elements: ");
			int n=sc.nextInt();
			int[] arr=new int[n];

			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the element: ");
				ele=sc.nextInt();
				stack.push(ele);
				
			}

			while(!stack.isEmpty())
			{
				temp=stack.pop();
			
				while(!tempstk.isEmpty() && tempstk.peek()<temp)
					stack.push(tempstk.pop());
				tempstk.push(temp);
		
			}
			
			for(int i=0;i<n;i++)
			{
				arr[i]=tempstk.pop();
				System.out.print(arr[i] + " " );
			}
		}

	}