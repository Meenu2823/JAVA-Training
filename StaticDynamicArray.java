import java.util.*;

public class StaticDynamicArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,5,7,24,63));
        int l=0,r=arr.size()-1;
        int x = 4,ind=0;
        while(l<=r)
        {
            int mid=(int)l+(r-l)/2;
            if(arr.get(mid)<x)
            {
                ind=mid+1;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        arr.add(ind,x);
        System.out.println(arr);
    }
    
}
