
import java.util.Scanner;


public class power {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter one number");
		int x=scn.nextInt();
		System.out.println("enter another number");
		int n=scn.nextInt();
		int pow,count,log;
		pow=1;
		count=1;
		while(count<=n)
		{
			pow=pow*x;
			count=count+1;
		}
		System.out.println(pow);
		System.out.println("enter one number");
		int a=scn.nextInt();
		System.out.println("enter another number");
		int b=scn.nextInt();
		log=0;
		while(a!=1)
		{
			a=a/b;
			log=log+1;
		}
		System.out.println("\n"+log);
	}

}
