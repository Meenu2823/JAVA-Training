import java.util.*;
public class ValidParenthesis {
    public static void generateParenthesis(int n,int o,int c,String s,ArrayList<String> vp)
    {
        if(s.length()>2*n||o>n||c>o)
            return;
        if(s.length()==2*n)
            vp.add(s);
        generateParenthesis(n, o+1, c, s+"{",vp);
        generateParenthesis(n,o,c+1,s+"}",vp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int open=0,close=0;
        String s="";
        ArrayList<String> vp = new ArrayList<>();//vp->Valid Parenthesis
        generateParenthesis(n,open,close,s,vp);
        System.out.println(vp);
    }
}
