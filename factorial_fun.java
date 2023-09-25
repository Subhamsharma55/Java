public class factorial_fun {
   void factorial(int n,int a)
    {
        for(int i=n;i>0;i--)
        {
            a=a*i;
            // a=product;
        }
        System.out.println(a);
    }
    public static void main(String args[])
    {
        factorial_fun t= new factorial_fun();
        // int product;
        int n=4;
        int a=1;
        t.factorial(n,a);
        
    }    
}
