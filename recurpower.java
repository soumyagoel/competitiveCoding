
import java.util.Scanner;

public class recurpower {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int n=scn.nextInt();
		int x=scn.nextInt();
		int c=pow(n,x);
		System.out.println(c);
	}
	public static int pow(int n,int x)
	{
		int a=1;
		if(n==0)
		{
			return 1;
		}
//		if(n%2!=0)
//		{
			a=(int)Math.pow(x,(n/2));
//		}
//		if(n%2==0)
//		{
//			a=(int)Math.pow(x,(n/2));
//		}
		return (a*a*x);
		
//		int a=(int)Math.pow(x,n-1);
//		int b=x*a;
//		return b;
	}
	
}
