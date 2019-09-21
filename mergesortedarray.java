package june30;
import java.util.Scanner;
public class mergesortedarray
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=scn.nextInt();
         int[] arr1=new int[n];
         for(int i=0;i<n;i++)
         {
        	 arr1[i]=scn.nextInt();
         }
//         for(int j=0;j<m;j++)
//         {
//        	 two[j]=scn.nextInt();
//         }
         int[] arr2=mergesort(arr1,0,arr1.length-1);
         for(int k=0;k<arr2.length;k++)
         {
        	 System.out.print(arr2[k]+"\t");
         }
	}
	public static int[] merge(int[] one,int[] two)
	{
		int n=one.length;
		int m=two.length;
		int k=0;
		int i=0;
		int j=0;
		int p=n+m;
		int[] arr1=new int[p];
	    	while(i<n&&j<m)
	    	{
	    			if(two[j]<one[i])
	    			{
	    				arr1[k]=two[j];
	    				j++;
	    				k++;
	    			}
	    			else
	    			{
	    				arr1[k]=one[i];
	    				i++;
	    				k++;
	    			}
	    	}
	    	while(i<n)
	    	{
	    		arr1[k]=one[i];
	    		i++;
	    		k++;
	    	}
	    	while(j<m)
	    	{
	    		arr1[k]=two[j];
	    		j++;
	    		k++;
	    	}
	    return arr1;
	}
	public static int[] mergesort(int[] arr,int lo,int hi)
	{
		if(lo==hi)
		{
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		int mid=(lo+hi)/2;
		int[] fhalf=mergesort(arr,lo,mid);
		int[] lhalf=mergesort(arr,mid+1,hi);
		int[] sortarray=merge(fhalf,lhalf);
		return sortarray;
	}
}
