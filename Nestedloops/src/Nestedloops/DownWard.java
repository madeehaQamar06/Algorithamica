package Nestedloops;

import java.util.Scanner;

public class DownWard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     System.out.println("enter n");
	    int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
			System.out.print("*");
			
		}
			System.out.println("\n");

	}

}
}
