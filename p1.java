
import java.util.Scanner;

public class p1 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int a,bin,pow,rem;
		a=10;
        pow=1;
		bin=0;
		while(n!=0)
		{
			rem=n%2;
			n=n/2;
			bin=bin+rem*pow;
			pow=10*pow;
		}
		System.out.println(bin);

	}

}
