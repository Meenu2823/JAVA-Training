import java.util.*;
public class ReverseOfString {
    // static  String reverse(String s,int n)
    // {
    //     if(n<0)
    //     return "";
    //     else
    //     return s.charAt(n)+reverse(s,n-1);
    // }
    static String reverse(String s)
    {
        if(s=="")
        return "";
        else
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        // System.out.println("The reverse of the given string is:"+reverse(str,str.length()-1));
        System.out.println("The reverse of the given string is:"+reverse(str));
    }
}
