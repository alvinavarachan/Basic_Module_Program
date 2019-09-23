package Sculptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sculptor {
	public static void main (String []args) throws IOException
	{
	
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	System.out.println ("Enter the kgs of gold: ");
	int gold = Integer.parseInt (br . readLine());
	int rem=0,idol=0;
	idol=idol+gold;
	while(gold>=5) {
	rem= gold/5;
	idol=idol+rem;
	gold=gold/5;
	}
	
	
	System.out.println ("Number of Sculptors can be made is "+idol);
	
	}

}
