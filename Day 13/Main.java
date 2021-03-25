//Find the maximum element from the stack

import java.util.*;
class Main{
	public static void main(String args[])
		{
			ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
			Scanner sc=new Scanner(System.in);
			int ele=0,val=0,max=0;
			System.out.println("Enter the no of elements: ");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the element: ");
				ele=sc.nextInt();
				stack.push(ele);
			}
			
			for(int i=0;i<n;i++)
			{
				val=stack.pop();
				if(val>max)
					max=val;
					

			}
			System.out.println("Max: "+ max);

		}

	}