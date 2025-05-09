import java.util.*;
public class GCD {
    static int gcd(int n1,int n2)
    {
        if(n2==0)
        return n1;
        else
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("The GCD OF "+n1+" and "+n2+" is "+gcd(n1,n2));
    }
}
