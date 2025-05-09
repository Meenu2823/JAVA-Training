import java.util.*;
public class cuberoot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double l=0,r=n/3,ans=0;
        double er=1e-6;
        while(l<=r)
        {
            double mid=l+(r-l)/2;
            double cu=mid*mid*mid;
            if(Math.abs(cu-n)<er)
            {
                ans=mid;
                break;
            }
            else if(cu<n)
            l=mid;
            else
            r=mid;
            ans=mid;
        }
        System.out.printf("%.6f",ans);
    }
}
