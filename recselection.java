package june21;
import java.util.*;
public class recselection {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int N=scn.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=scn.nextInt();
        }
        sel(arr,0,arr.length-1);
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void sel(int[] arr,int si,int li)
    {
        if(si==arr.length-1)
        {
            return;
        }
        if(si==li)
        {
             sel(arr,si+1,arr.length-1);
            return;
        }
        if(arr[si]>arr[li])
        {
            int temp=arr[si];
            arr[si]=arr[li];
            arr[li]=temp;
        }
        sel(arr,si,li-1);
        return;
    }
}
