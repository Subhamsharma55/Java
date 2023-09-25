public class leap_year {
    public static void main(String[] args) {
        int year=2004;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(" leap year");
                }
                else{
                    System.out.println(" not a leap year");
                }}
            else
                {
                    System.out.println("a leap year");
                }   
        }
            else{
                System.out.println("not a leap year");
            }
    }
    
}
