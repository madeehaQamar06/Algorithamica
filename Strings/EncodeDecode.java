package Strings;

import java.util.Scanner;

public class EncodeDecode {
	static int decode(char c) {
		int value = (int) c;
		return value;
	}
	static char encode(int n) {
		char ch = (char)n;
		return ch;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter decode c");
		char c = s.next().charAt(0);
		System.out.println(decode(c));
		System.out.println("enter encode n");
		int n = s.nextInt();
		System.out.println(encode(n));
		
		

	}

}
