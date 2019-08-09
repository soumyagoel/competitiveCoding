package june16;
import java.util.Scanner;
public class recursionincdec1 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int n=scn.nextInt();
		decinc(n);
	}
	public static void decinc(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2!=0)
		{
		System.out.println("hi"+n);
		}
		decinc(n-1);			
		if(n%2==0)
		{
		System.out.println("bye"+n);
		}
	}
}
