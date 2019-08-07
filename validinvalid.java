package june14;

import java.util.*;

public class validinvalid {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int prev = scn.nextInt();
		int curr = 0;
		int count = 2;
		Boolean gd = true;
		while (count <= n) {
			curr = scn.nextInt();
			if (gd) {
				if (curr < prev) {

				} else {
					gd = false;
				}
			} else {
				if (curr > prev) {

				} else {
					System.out.println(false);
					return;
				}
			}
			prev = curr;
			count++;
		}
		System.out.println("true");
	}
}