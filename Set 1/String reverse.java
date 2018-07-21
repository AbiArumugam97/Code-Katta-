package string.reverse;
public class StringReverse {
    public static void main(String[] args) {
        String s="111222";
        try
        {
        if(s.length()<=100000)
        {
        if(s.isEmpty())
        {
            System.out.println("String is null");
        }
        else
        {
        StringBuilder sb=new StringBuilder(s);
        System.out.println(s);
        System.out.println(sb.reverse());
        }
        }
        else
        {
            System.out.println("Error");
        }
    }
    catch(NumberFormatException e)
    {
        System.out.println("Exception");
    }
}
}
