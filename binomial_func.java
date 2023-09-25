public class binomial_func {
    
 static  void factorial(int n,int a)
    {
        for(int i=n;i>0;i--)
        {
           
           int a=1;
            a=a*i;
            // a=product;
        }
        System.out.println(a);
    }
    static int binomila(int n,int r)
    {
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nr_fact= factorial(n-r);
        int bin=n_fact/(r_fact*nr_fact);
        System.out.println(bin);
        return bin;

    }
    public static void main(String args[])
    {
        // factorial(n,a);
        System.out.println(binomila(4,1));       
    }    
}
