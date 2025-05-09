import java.util.*;
public class fibonacci {
    // static void fibo(int a,int b,int n)
    // {
    //     if(n==0)
    //     return;
    //     int c=a+b;
    //     System.out.print(c+" ");
    //     fibo(b,c,n-1);
    // }
    static int fib(int n)
    {
        if (n==0)
        return 0;
        else if (n==1)
        return 1;
        else
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        // int n1=0;
        // int n2=1;
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the number of terms");
        // int n = sc.nextInt();
        // System.out.print(n1+" "+n2+" ");
        // fibo(n1,n2,n-2);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n(nth term): ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
