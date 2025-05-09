import java.util.*;
public class ReversingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Original: " + n + " -> " + Integer.toBinaryString(n));
        int res=0;
        for(int i=0;i<32;i++)
        {
            int lb= n & 1;
            res=res<<1;
            res = res | lb;
            n=n>>1;
        }
        System.out.println("Reversed: " + res + " -> " + Integer.toBinaryString(res));
    }
}
