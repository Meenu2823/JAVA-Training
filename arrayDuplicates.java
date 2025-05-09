// import java.util.*;
// public class arrayDuplicates {
//     Scanner scan = new Scanner(System.in);
//     int n = scan.nextInt();
//     int[] arr = new int[n];
//     for(int i=0;i<n;i++)
//     {
//         arr[i]=scan.nextInt();
//     }
//     for(int i=0;i<n;i++)
//     {
//         for(int j=i+1;j<n;j++)
//         {
//             if(arr[i]==arr[j])
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }
import java.util.Scanner;
public class arrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
