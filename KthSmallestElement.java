package array;
import java.util.*;
class KthElement
{
    public int findKthSmallestElement(int y[],int lb,int ub,int pp)
    {
        int swapCount;
        int e=0,f=0;
        do
        {
           e=lb;
           f=ub;
           swapCount=0;
           int g=0;
           while(e<pp)
            {
              if(y[e]>y[pp])
                {
                 g=y[e];
                 y[e]=y[pp];
                 y[pp]=g;
                 swapCount++;
                 break;
                }
              else e++;
            }
            while(f>pp)
            {
              if(y[pp]>y[f])
                {
                 g=y[pp];
                 y[pp]=y[f];
                 y[f]=g;
                 swapCount++;
                 break;
                }
              else f--;
            }
        }while(swapCount!=0);
        if(swapCount==0) return y[pp];
        else return -1;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element: ");
            array[i]=sc.nextInt();
        }
        System.out.print("Value of K : ");
        int k=sc.nextInt();
        KthElement ke=new KthElement();
        int smallest=ke.findKthSmallestElement(array,0,size-1,k-1);
        System.out.println("Kth smallest element is : "+smallest);
        sc.close();
    }
}