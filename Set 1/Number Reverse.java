package reverse.number;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
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
           System.out.println(sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error");
        }
    }
}
