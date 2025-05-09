import java.util.*;


public class RestoringIPAddress {
    public static boolean isValid(String ip_part)
    {
        if(ip_part.isEmpty()||ip_part.length()>3||Integer.parseInt(ip_part)>255||(ip_part.startsWith("0")&ip_part.length()>1))
            return false;
        return true;
    }
    public static void generateValidIP(String s,int seg,int start,String addr,List<String> v_ips)
    {
        if(seg>3)
        {
            if(start==s.length())
                v_ips.add(addr);
            return;
        }
        for(int i=start;i<s.length();i++)
        {
            String curr=s.substring(start,i+1);
            if (isValid(curr))
            {
                String updatedAddr = (seg==0)?curr:addr+"."+curr;
                generateValidIP(s,seg+1,i+1,updatedAddr,v_ips);
            }
        }
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> v_ips = new ArrayList<>();
        String addr="";
        int seg=0,start=0;
        generateValidIP(s,seg,start,addr,v_ips);
        return v_ips;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> valid_ips=restoreIpAddresses(s);
        System.out.println(valid_ips);
    }
}
