import java.util.*;


class subArraySumMain
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of test cases:");
int t = sc.nextInt();

for (int i = 0; i < t; i++)
{
System.out.println("Enter size of array:");
int n = sc.nextInt();
System.out.println("Enter the number:");
int s = sc.nextInt();

int[] m = new int[n];
for (int j = 0; j < n; j++)
{
System.out.println("Enter array element:");
m[j] = sc.nextInt();
}
            
Solution obj = new Solution();
ArrayList<Integer> res = obj.subarraySum(m, n, s);
for(int ii = 0;ii<res.size();ii++)
System.out.print(res.get(ii) + " ");
System.out.println();
}
}

}


class Solution
{
//Function to find a continuous sub-array which adds up to a given number.
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
{
ArrayList<Integer> list=new ArrayList<>();
int checksum,i,j;
for(i=0;i<n;i++)
{
checksum=arr[i];
for(j=i+1;j<=n;j++)
{
if(checksum==s)
{
int p=j-1;
list.add(i+1);
list.add(p+1);
break;
}
if(checksum>s || j==n)
{
break;
}
checksum+=arr[j];   
}
if(checksum==s) break;
else continue;
}
return list;
}
}