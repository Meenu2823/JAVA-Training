import java.util.*;
public class SumOfNaturalNo {
    static int sumOfN(int n)
    {
        if(n==1)
        return 1;
        else
        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }
}
