package Amstrong;
import java.util.Scanner;



public class Amstrong {
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int inp;
		int power,sum=0,rem,temp,count=0; 
		inp = sc.nextInt();
	    temp=inp;
	    int len= inp;
	    while (len!=0)
	    {
	    	len=len/10;
	    	count++;
	    	
	    }
	    while(inp!=0)  
	    {  
	    rem=inp%10;  
	    inp=inp/10;
	    power= (int) Math.pow(rem,count);
	    sum=sum+power;
	    System.out.println(sum);
	    }  
	    if(temp==sum)  
	    System.out.println("The given number is amstrong");   
	    else  
	        System.out.println("The given number is not amstrong");   
	   }  
}
	


