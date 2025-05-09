import java.util.*;
public class CommonPrefix {
    static String LCP(String[] strs)
    {
        for(int i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=c)
                return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr= new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println("The Longest Common Prefix is: "+LCP(arr));
    }
    
}
