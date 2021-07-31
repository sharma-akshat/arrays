package array;

import java.util.*;
class RangeAndCoefficient
{
    public float findMaxNumber(float[] x)
    {
        float maximum=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>maximum) maximum=x[i];
        }
        return maximum;
    }
    public float findMinNumber(float[] y)
    {
        float minimum=y[0];
        for(int i=1;i<y.length;i++)
        {
            if(y[i]<minimum) minimum=y[i];
        }
        return minimum;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        float array[]=new float[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the number : ");
            array[i]=sc.nextFloat();
        }
        RangeAndCoefficient rc=new RangeAndCoefficient();
        float max=rc.findMaxNumber(array);
        float min=rc.findMinNumber(array);
        float range=max-min;
        float coefficient=range/(max+min);
        System.out.println("Range is : "+range+" and coefficient is "+coefficient);
        sc.close();  
    }
}