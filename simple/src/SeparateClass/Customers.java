
package SeparateClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customers {
	
	
public static void main(String[] args) throws NumberFormatException, IOException 


{
BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
	System.out.println("1:Register");
	int x=Integer.parseInt(br.readLine());
switch(x)
{
	case 1:
		Registration r =new Registration();
		r.register();
		break;
	
		
		
}


		
}

	

}