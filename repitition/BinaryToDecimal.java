package repitition;

import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int base = 1;// 2^0
		int n = s.nextInt();
		int decimal = 0;
		while (n > 0) {
			int digit = n % 10;
			decimal += digit * base;
			base = base * 2;
			n = n / 10;
		}
		System.out.println("decimal is" + decimal);

	}

}
