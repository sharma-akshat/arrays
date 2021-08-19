package array;
import java.util.*;
class ZeroSumSubarray
{
    static boolean subArrayExists(int[] array)
    {
       Set<Integer> hs=new HashSet<>();
       int sum=0;
       for(int i=0;i<array.length;i++)
       {
           sum+=array[i];
           if(array[i]==0 || sum==0 || hs.contains(sum)) return true;
           hs.add(sum);
       }
       return false;
    }
    public static void main(String gg[])
    {
        int array[]={2,2,3,5,6,10,11};
        if(subArrayExists(array)) System.out.println("Sub array with sum 0 exists");
        else System.out.println("No sub array with sum 0 exists");
    }
}