import java.util.*;
public class multiplication {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int prod=n1;
        for(int i=1;i<n2;i++)
        {
            prod+=n1;
        }
        System.out.println(n1+" X "+n2+" = "+prod);
    }
}
