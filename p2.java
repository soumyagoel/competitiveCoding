
import java.util.Scanner;

public class p2 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int pow,dec,rem;
		dec=0;
		pow=1;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			dec=dec+rem*pow;
			pow=2*pow;
		}
		System.out.println(dec);
	}

}
