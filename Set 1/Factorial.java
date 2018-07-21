package fact;

import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ip=s.next();
        int i,fact=1;
        try
        {
          int a=Integer.parseInt(ip);  
            if(a==0)
          {
              System.out.println("1");
          }
            else
            {
         for(i=1;i<=a;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Input is invalid");
        }
}
}
