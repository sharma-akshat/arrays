package array;
import java.util.*;
class CyclicRotation
{
    public void rotateArray(long[] array,int lb,int size,int rotateBy)
    {
        int i=0;
        long out=0;
        while(rotateBy>0)
        {
            out=array[size-1];
            i=size-2;
            while(i>=lb)
            {
                array[i+1]=array[i];
                i--;
            }
            i=0;
            array[i]=out;
            rotateBy--;
        }
        for(int j=0;j<size;j++) System.out.print(array[j]+" ");
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        long array[]=new long[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element: ");
            array[i]=sc.nextInt();
        }
        CyclicRotation cr=new CyclicRotation();
        System.out.print("Rotate by how many elements: ");
        int rotateBy=sc.nextInt();
        cr.rotateArray(array,0,size,rotateBy);
        sc.close();
    }
}
