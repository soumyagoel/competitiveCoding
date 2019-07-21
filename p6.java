package june9;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scn.nextInt();
		int r = scn.nextInt();
		int rem, a, b, c, d, rem1;
		d = 0;
		b = n;
		a = 0;
		c = 0;
		int k = n;
		while (k > 0) {
			k = k / 10;
			c = c + 1;
		}
		if (r > 0) {
			int i = (int) Math.pow(10, r);
			rem1 = n % i;
			n = n / i;
			int m = (int) Math.pow(10, c - r);
			n = rem1 * m + n;

			System.out.println(n);
		} else {
			r = c + r;
			int i = (int) Math.pow(10, r);
			rem1 = n % i;
			n = n / i;
			int m = (int) Math.pow(10, c - r);
			n = rem1 * m + n;

			System.out.println(n);

		}

	}

}
