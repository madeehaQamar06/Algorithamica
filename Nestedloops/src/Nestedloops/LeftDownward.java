package Nestedloops;
import java.util.*;
public class LeftDownward {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
				for(int j=n;j>=i;j--) {
					System.out.print("*");
				}
			
		
			System.out.println("\n");
		}
	}

	}


