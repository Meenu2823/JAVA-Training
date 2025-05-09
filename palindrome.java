import java.util.*;
public class palindrome {
    static boolean check(int n)
    {
        /*String org= Integer.toString(n);
        int left=0,right=org.length()-1;
        while(left<=right)
        {
            if(org.charAt(left)!=org.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;*/
        int rev=0,temp;
        while(n>rev)
        {
            temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        return n==rev || n==rev/10;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(check(num))
        {
            System.out.println(num+" is a Palindrome");
        }
        else{
            System.out.println(num+" is not a Palindrome");
        }
    }
}
