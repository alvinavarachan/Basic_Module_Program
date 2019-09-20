package Height;
import java.util.Scanner;
public class Height 
{
public static void main(String [] args) 
{
	Scanner s = new Scanner(System.in);
	int total,i,j;
	float temp;
	System.out.println("Enter number");
	total = s.nextInt();
	System.out.println("Enter the heights");
	float arr [] = new float[total];

	for(i=0;i<total;i++)
	{
		arr[i] = s.nextFloat();  
	}
	for(i=0;i<total;i++)
	{
		for(j=0;j<total;j++)
		{
			if(arr[i]<arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
System.out.println("After Sorting");
for(i=0;i<total;i++)
{
System.out.println(arr[i]);  
}
}
}