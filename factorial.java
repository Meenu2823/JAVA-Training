import java.util.*;
public class factorial {
    // static int Fact(int n)
    // {
    //     if(n==1)
    //         return 1;
    //     else
    //         return n*Fact(n-1);
    // }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int fact=n;
        for(int i=1;i<n;i++)
        {
            fact*=i;
        }
        // int fact=Fact(n);
        System.out.println("Factorial of "+n+" is "+fact);
        
    }
}
