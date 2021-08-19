package array;
import java.util.*;
class IntersectionOfArrays
{
    public void intersectionOfTwo(int[] x,int[] y,int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(x[i]<y[j]) i++;
            else if(y[j]<x[i]) j++;
            else
            {
                System.out.print(x[i]+" ");
                j++;
                i++;
            }
        }
    }
    //Above code shows intersection between two sorted arrays

static void intersectionOfThree(int[] array1,int[] array2,int[] array3)
{
    int i=0,j=0,k=0;
    while(i<array1.length & j<array2.length && k<array3.length)
    {
        if(array1[i]==array2[j] && array2[j]==array3[k])
        {
            System.out.print(array1[i]+" ");
            i++;
            j++;
            k++;
        }
        else if(array1[i]<array2[j]){
            i++;
        }
        else if(array2[j]<array3[k]){
            j++;
        }
        else k++;
    }
}
//Above code shows intersection between three sorted arrays

    
    public static void main(String gg[])
    {
        int array1[]={1, 5, 10, 20, 40, 80};
        int array2[]={6, 7, 10, 20, 80, 100};
        int array3[]={3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println("Between array1 and array2 common elements are: ");
        intersectionOfTwo(array1, array2, array1.length, array2.length);
        System.out.println();
        System.out.println("Common elements between all the three arrays are: ");
        intersectionOfThree(array1, array2, array3);
    }
}
