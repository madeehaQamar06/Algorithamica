package Function2;

import java.util.Scanner;

public class MedianOfThree {
	static int medianOfThree(int a,int b,int c) {
		if((a< b  && b < c) || (c < b && b < a)){
			return b;
		}
		else if((b < a && a < c)||(c < a && a<b)){
			return a;
		}
		else
		return c;
		 
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a b c");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(medianOfThree(a,b,c));

	}

}
