import java.util.*;
public class trailingzeros {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        while(n>5)
        {
            n=n/5;
            count+=n;
        }
        System.out.println(count);
    }
}
