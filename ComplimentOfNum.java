import java.util.*;
public class ComplimentOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int bitL=Integer.toBinaryString(n).length();
        // int mask=(1<<bitL)-1;
        // int comp=n^mask;
        int mask=0;
        while(mask<n)
        {
            mask=mask<<1;
            mask=mask|1;
        }
        int comp=~n&mask;
        System.out.printf("The 1's compliment of %d is %d",n,comp);
        // System.out.println();
        System.out.printf("\nThe 2's compliment of %d is %d",n,~n+1);

    }
}
