import java.util.*;
public class OddOrEven {
    static public void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if((n & 1)!= 0)
        System.out.printf("%d is an Odd number",n);
        else
        System.out.printf("%d is an Even number",n);
    }
    
}
