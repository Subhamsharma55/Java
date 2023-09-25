import java.util.Scanner;

public class toggle_str {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s =sc.next();
    String g="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
        {
            g=g+(char)(s.charAt(i)-32);
        }
        else{
            g=g+(char)(s.charAt(i)+32);
        }
    }
    System.out.print(g);
    
    }
}
