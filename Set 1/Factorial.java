/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String ip=s.next();
        int i,fact=1;
        try
        {
          int a=Integer.parseInt(ip);
          if(a<=20)
          {
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
        System.out.println(+fact);
    }
        }
          else
          {
              System.out.println("Range Exceeds");
          }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Input is invalid");
        }
}
}
