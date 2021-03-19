//Remove the duplicate elements from a sorted linked list

import java.util.*;

class Main{
	public static void main(String args[])
	{
		TreeSet<Integer> ans=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		String st="";
		int ele=0,val=0;

		System.out.println("Enter the no. of elements: ");
		int n=sc.nextInt();

		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			ele=sc.nextInt();
			ans.add(ele);
		}

		LinkedList<Integer> al=new LinkedList<Integer>(ans);
		for(int i=0;i<al.size();i++)
		{
			if(i==al.size()-1)
				{
					val=al.get(i);
					st=st+val ;
				}
			else
				{
					val=al.get(i);
					st=st+val +"=>";
				}

		}	
	System.out.print(st);

	}
}
