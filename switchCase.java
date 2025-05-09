import java.util.Scanner;

public class switchCase {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ch = sc.nextInt();
        while(ch!=5)
        {
            switch(ch)
            {
                case 1:add(n1,n2);
                break;
                case 2:sub(n1,n2);
                break;
                case 3:mul(n1,n2);
                break;
                case 4:div(n1,n2);
                break;
                default:System.out.println("Invalid input");
            }
            ch = sc.nextInt();
        }
    }
    static void add(int n1,int n2)
    {
        System.out.println("Sum = "+(n1+n2));
    }
    static void sub(int n1,int n2)
    {
        System.out.println("Difference = "+(n1-n2));
    }
    static void mul(int n1,int n2)
    {
        System.out.println("Product = "+(n1*n2));
    }
    static void div(int n1,int n2)
    {
        System.out.println("Quotient = "+(n1/n2));
    }
}
