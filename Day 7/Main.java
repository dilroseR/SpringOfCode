import java.util.*;

class Main{
	public static void main(String args[])
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		String st="";
		System.out.println("Enter the no. of elements: ");
		int n=sc.nextInt();
		int ele=0,val=0;
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			ele=sc.nextInt();
			al.add(ele);
		}
		
		Collections.reverse(al);
		
		for(int i=0;i<al.size();i++)
		{
			val=al.get(i);
			if(i==(al.size()-1))
			
				st=st+val;
			
			else
				st=st+val+" =>";
			
		}
		System.out.println(st);		

	}
}
