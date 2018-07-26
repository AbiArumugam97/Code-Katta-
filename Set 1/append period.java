/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(str.equals("") || str.equals(" "))
        
        {
        System.out.println("error");
        }
        
        else
        {
            String ip=(new StringBuilder()).append(str).append(".").toString();
            System.out.println(ip);
    }
	}

	
}
