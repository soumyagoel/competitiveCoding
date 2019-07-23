
import java.util.Scanner;


public class gcd {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter one number");
		int n1=scn.nextInt();
		System.out.println("enter the number");
		int n2=scn.nextInt();
		int divs,divd,rem,l;
		divs=n2;
		divd=n1;
		while(divd%divs!=0)
		{
			rem=divd%divs;
			divd=divs;
			divs=rem;
		}
		System.out.println(divs);
		l=(n1*n2)/divs;
		System.out.println("\n"+l);
	}

}
