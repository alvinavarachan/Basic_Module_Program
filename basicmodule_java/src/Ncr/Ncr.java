package Ncr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ncr {
public static void main(String args[]) throws NumberFormatException, IOException {
int n,i,r;
long q,w,f=1,a=1,z=1,s;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of n");
n = Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
f = f * i;
}

System.out.println("Enter the value of r");
r = Integer.parseInt(br.readLine());
for(i=1;i<=r;i++)
{
z = z * i;
}
s = n-r;
for(i=1;i<=s;i++)
{
a = a * i;
}
w = a *z;
q = f/w;
System.out.println("The NCR factor for given values is "+q);
}
}