public class reverse_array {
    public static void reverse(int number[])
    {
        for (int i=number.length-1;i>0;i--)
        {
        //    int rev[]=(int) number[i];
            System.out.print(number[i]);
        }
        

    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        reverse(number);
    }
}