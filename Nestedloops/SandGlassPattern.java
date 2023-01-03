package Nestedloops;

import java.util.Scanner;

public class SandGlassPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-4;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
					for(int j=1;j<=n;j++) {
					System.out.print("*");
				}
				System.out.println("\n");
			}

	}

}
