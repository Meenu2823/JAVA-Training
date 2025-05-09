import java.util.*;
public class amstrong {
    static boolean isAmstrong(int n)
    {
        int digits=(int) (Math.floor(Math.log10(n))+1);
        int sum=0,temp,num=n;
        while(n>0)
        {
            temp=n%10;
            sum+=Math.pow(temp,digits);
            n/=10;
        }
        if(sum==num)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(isAmstrong(i))
            System.out.println(i);
        }
    }
}
