import java.util.*;
class arrayRotation
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int x[]=new int[size];
        int result[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element:");
            x[i]=sc.nextInt();
        }
        System.out.print("Enter the number of terms to be rotated:");
        int d=sc.nextInt();
        arrayRotation ar=new arrayRotation();
        result=ar.rotation(x,size,d);
        System.out.println("Rotated array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(result[j]+" ");
        }
        System.out.println();
        sc.close();
    }
    public int[] rotation(int[] x,int size,int d)
    {
        int r=1;
        while(r<=d)
        {
            int lb=0;
            int out=x[lb];
            while(lb<=size-2)
            {
                x[lb]=x[lb+1];
                lb++;
            }
            x[lb]=out;
            r++;
        }
        return x;
    }
}