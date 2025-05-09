import java.util.*;

public class nthRoot {
    static double nthPow(double num,int n)
    {
        double res=1;
        for(int i=0;i<n;i++)
        {
            res*=num;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int n = sc.nextInt();
        double l=0,r=num/n,ans=0;
        double er=1e-6;
        while(l<=r)
        {
            double mid=l+(r-l)/2;
            double cu=nthPow(mid,n);
            if(Math.abs(cu-num)<er)
            {
                ans=mid;
                break;
            }
            else if(cu<num)
            l=mid;
            else
            r=mid;
            ans=mid;
        }
        System.out.printf("%.6f",ans);
    }
}
