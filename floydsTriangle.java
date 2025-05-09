import java.util.*;
public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.printf("%d ",c);
                c++;
            }
            System.out.println();
        }
    }
    
}
