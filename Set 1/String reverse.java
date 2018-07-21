package string.reverse;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String s=ip.nextLine();
        if(s.length()==0)
        {
            System.out.println("String is null");
        }
        else if(s.length()>0 && s.length()<=100000)
        {
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        }
        else
        {
            System.out.println("Error");
        }
}
}
