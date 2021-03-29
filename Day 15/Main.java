// Delete the middle element of a stack
import java.util.*;
class Main{
	public static void main(String args[])
		{
			ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
			ArrayDeque<Integer> stack1=new ArrayDeque<Integer>();
			Scanner sc=new Scanner(System.in);
			int ele=0,middle=0;
			System.out.println("Enter the no of elements: ");
			int n=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the element: ");
				ele=sc.nextInt();
				stack.push(ele);
				
			}

			middle=n/2;
		
			for(int i=0;i<n;i++)
			{
				if(i==middle)
					stack.pop();
				else
				{
					ele=stack.pop();		
					stack1.push(ele);
				}
			}
			System.out.print(stack1);

		}

	}