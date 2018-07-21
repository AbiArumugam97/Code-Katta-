/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
        String ip=s.nextLine();
        int rem=0,sum=0;
        try
        {
           int n=Integer.parseInt(ip);
           while(n>0)
           {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
           }
           System.out.print(sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error");
        }
	}
}
