package array;
class Duplicates
{
    /*
    public void duplicates(int[] array,int size)
    {
        for(int i=0;i<=size-2;i++)
        {
            for(int j=i+1;j<=size-1;j++)
            {
                if(array[i]==array[j]) System.out.println("Duplicate element is : "+array[i]);            }
        }
    }
    
//Time complexity of above code is O(n^2)
*/

void findDuplicates(int[] array,int size)
    {
        System.out.println("Repeating elements are: ");
        for(int i=0;i<size;i++)
        {
            int j=Math.abs(array[i]);
            if(array[j]>=0) array[j]=-array[j];
            else System.out.println(j+" ");
        }
    }
    //Time complexity of above code is O(n)
    
    public static void main(String gg[])
    {
        int arr[]={1,2,3,1,5,3,6};
        int size=arr.length;
        Duplicates d=new Duplicates();
        d.findDuplicates(arr,size);
        //d.duplicates(arr,size); ---> for calling out the duplicates() method
    }
}
