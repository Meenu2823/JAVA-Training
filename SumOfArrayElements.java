import java.util.*;
public class SumOfArrayElements {
    static int sum(int[] arr,int ind)
    {
        if(ind==0)
        return arr[0];
        else
        return arr[ind]+sum(arr,ind-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println("The sum of the elements is:"+sum(arr,n-1));
    }
}
