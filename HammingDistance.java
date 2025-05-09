import java.util.*;
public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = n1^n2;
        int count=0;
        while(res>0)
        {
            int lb=res&1;
            if(lb==1)
                count++;
            res=res>>1;
        }
        System.out.println("The Hamming Distance of "+n1+"("+Integer.toBinaryString(n1)+")"+" and "+n2+"("+Integer.toBinaryString(n2)+") is "+count);
    }
}
