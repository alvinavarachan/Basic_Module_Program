package LinkedClone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist 
{

	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter List size");
		int n= sc.nextInt();
		LinkedList<String> list= new LinkedList();
		
		for (int i=0; i<n; i++)
		{
			System.out.println ("Enter List Index["+i+ "]");
			String name= sc.next();
			list.add(name);
			
		}
		
		System.out.println ("Actual LinkedList");
		
		Iterator<String> itr1=list.iterator();
		while (itr1.hasNext())
		{
			System.out.println (itr1.next());
		}
		LinkedList<String>list2= new LinkedList<String>();
		list2= (LinkedList)list.clone();
		
		 System.out.println("Cloned LinkedList");
		 
		 Iterator<String> itr2=list2.iterator();
			
		 while (itr2.hasNext())
			{
				System.out.println (itr2.next());
			}
		
	}
}