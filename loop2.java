public class loop2 {
    public static void main(String[] args) {
        int n=43221;
        while(n>0)
        {
            int last =n%10;
            System.out.print(last+" ");
            n=n/10;
        }
        // System.out.println();
    }
}
