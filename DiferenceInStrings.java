import java.util.*;
public class DiferenceInStrings {
    static char findDiff(String s1,String s2)
    {
        String joined = s1+s2;
        char res= joined.charAt(0);
        for(int i=1;i<joined.length();i++)
        {
            res^=joined.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("The different character from the given 2 strings is:"+findDiff(str1,str2));
    }
}
