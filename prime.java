import java.util.*;
public class prime {
    static int iter=0;
    // static boolean isPrime(int n)
    // {
    //     if(n==1)
    //         return false;
    //     for(int i=2;i<=Math.sqrt(n);i++)
    //     {
    //         if(n%i==0)
    //             return false;
    //         iter++;
    //     }
    //     return true;
    // }
    static void sieveOfEratosthenes(int n)
    {
        boolean prime[]=new boolean[n+1];
        // for(int i=0;i<n+1;i++)
        // {
        //     prime[i]=true;
        //     iter++;
        // }
        Arrays.fill(prime,true);
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                    iter++;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==true)
                    System.out.println(i);
            iter++;
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        //int n1= scan.nextInt();
        // int n2=scan.nextInt();
        // for(int i=n1;i<=n2;i++)
        // {
            //if(isPrime(i))
        //         System.out.println(i);
        //     iter++;
        // }
        int n=scan.nextInt();
        sieveOfEratosthenes(n);
        System.out.println("The number of iterations are "+iter);
    }
}
