
import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter a number");
		int n = scn.nextInt();
		int rem, a, b, c;
		a = 0;
		b = 0;
		c = 1;
		while (n != 0) {
			rem = n % 10;
			if (c % 2 == 0) {
				a = a + rem;
			}
			if (c % 2 != 0) {
				b = b + rem;
			}
			c = c + 1;
			n = n / 10;
		}
		System.out.println(b);
		System.out.println(a);
		
	}

}
