import java.util.*;
public class increasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        int flag=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<5;i++)
        {
            if(arr[i-1]>arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag!=0)
        System.out.println("Not in an Increasing Order");
        else
        System.out.println("Increasing Order");
    }
}
