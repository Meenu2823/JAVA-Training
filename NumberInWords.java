import java.util.*;
import java.lang.Math;
//Range of number should be between 0-9999
public class NumberInWords {
    static String numToWord(int n)
    {
        switch(n)
        {
            case 1:return "One";
            case 2:return "Two";
            case 3:return "Three";
            case 4:return "Four";
            case 5:return "Five";
            case 6:return "Six";
            case 7:return "Seven";
            case 8:return "Eight";
            case 9:return "Nine";
            default:return "";
        }
    }
    static String twoDigits(int n)
    {
        switch(n) 
        {
            case 10:return "Ten";
            case 20:return "Twenty";
            case 30:return "Thirty";
            case 40:return "Forty";
            case 50:return "Fifty";
            case 60:return "Sixty";
            case 70:return "Seventy";
            case 80:return "Eighty";
            case 90:return "Ninety";
            case 11:return "Eleven";
            case 12:return "Twelve";
            case 13:return "Thirteen";
            case 14:return "Fourteen";
            case 15:return "Fifteen";
            case 16:return "Sixteen";
            case 17:return "Seventeen";
            case 18:return "Eighteen";
            case 19:return "Nineteen";
            default:return "";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0)
            System.out.println("Zero");
        int digits=(int)Math.floor(Math.log10(n)+1);
        if (digits==1)
        {
            System.out.println(numToWord(n));
        }
        else if(digits==2)
        {
            // int temp = n%100;
            if(n%10==0 || (n>=11&&n<=19))
            {
                System.out.println(twoDigits(n));
            }
            else{
                int rem=n%10;
                int t2=(n/10)*10;
                System.out.println(twoDigits(t2)+" "+numToWord(rem));
            }
        }
        else if(digits==3)
        {
            int temp = n%100;
            if(temp==0)
            System.out.println(numToWord(n/100)+" "+"Hundred");
            else{
                if(temp%10==0 || (temp>=11&&temp<=19))
                {
                    System.out.println(numToWord(n/100)+" "+"Hundred and "+twoDigits(temp));
                }
                else
                {
                    int rem=temp%10;
                    int t2=(temp/10)*10;
                    System.out.println(numToWord(n/100)+" "+"Hundred and "+twoDigits(t2)+" "+numToWord(rem));
                }
                
            }
            
        }
        else if(digits==4)
        {
            int temp=n%1000;
            if(temp==0)
            System.out.println(numToWord(n/1000)+" "+"Thousand");
            int d =(int)Math.floor(Math.log10(temp)+1);
            if(d==1)
            System.out.println(numToWord(n/1000)+" "+"Thousand "+numToWord(temp));
            else if(d==2)
            {
                if(temp%10==0 || (temp>=11&&temp<=19))
                {
                    System.out.println(numToWord(n/1000)+" "+"Thousand "+twoDigits(temp));
                }
                else{
                    int rem=temp%10;
                    int t2=(temp/10)*10;
                    System.out.println(numToWord(n/1000)+" "+"Thousand "+twoDigits(t2)+" "+numToWord(rem));
                }
            }
            else
            {
                int t3 = temp%100;
                if(t3==0)
                System.out.println(numToWord(n/1000)+" "+"Thousand "+numToWord(temp/100)+" "+"Hundred");
                else{
                    if(t3%10==0 || (t3>=11&&t3<=19))
                    {
                        System.out.println(numToWord(n/1000)+" "+"Thousand "+numToWord(temp/100)+" "+"Hundred and "+twoDigits(t3));
                    }
                    else{
                        int rem=t3%10;
                        int t2=(t3/10)*10;
                        System.out.println(numToWord(n/1000)+" "+"Thousand "+numToWord(temp/100)+" "+"Hundred and "+twoDigits(t2)+" "+numToWord(rem));
                    }
                    
                }
            }

        }

    }
}
