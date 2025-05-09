import java.util.*;
public class NoOfOnesInBin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int temp=num;
        while(temp>0)
        {
            int lb=temp&1;
            if(lb==1)
                count++;
            temp=temp>>1;
        }
        System.out.println("The number of ones in the binary value of "+num+"("+Integer.toBinaryString(num)+")"+" is "+count);
    }
}
