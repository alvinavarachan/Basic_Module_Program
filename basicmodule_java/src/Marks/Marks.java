package Marks;
import java.io.*;
public class Marks 
{
public static void main(String args[]) throws NumberFormatException, IOException 
{
	int n,i,j,temp;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of students ");
	n=Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	System.out.println("Enter the marks of students ");
	for(i=0;i<n;i++)
	{
		arr[i]= Integer.parseInt(br.readLine());
	}
	for(i=0;i<n;i++) 
	{
		for(j=0;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("The priority of marks is");
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}

}