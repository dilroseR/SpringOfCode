//Rearrange a linked list by separating odd nodes from even one
// while arranging,all even numbers should appear before odd numbers, also the order of even & odd numbers must be kept same

import java.util.*;

class Main{
	public static void main(String args[])
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		LinkedList<Integer> bl=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		String st="";
		int a=0,b=0,m=0,ele=0,val=0;

		System.out.println("Enter the no. of elements in the linked list: ");
		int n=sc.nextInt();

		System.out.print("Enter the elements of the linked list: ");
		for(int i=0;i<n;i++)
		{
			ele=sc.nextInt();
			al.add(ele);
		}

// for keeping even elements first
		for(int i=0;i<n;i++)
		{
			m=al.get(i);
			if(m%2==0)
			
				bl.add(m);		
		}

// for keeping odd elements second
		for(int i=0;i<n;i++)
		{
			m=al.get(i);
			if(m%2!=0)
				bl.add(m);
		}
		

		for(int i=0;i<bl.size();i++)
		{
			val=bl.get(i);
			if(i==(bl.size()-1))
			
				st=st+val;
			
			else
				st=st+val+" =>";
			
		}
		System.out.println(st);	
	

	}
}
