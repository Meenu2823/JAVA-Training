import java.util.*;
public class PowerOfTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if((n & (n-1))==0)
        System.out.printf("%d is a power of 2",n);
        else
        System.out.printf("%d is not a power of 2",n);
    }
        
}
