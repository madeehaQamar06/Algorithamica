package Nestedloops;
import java.util.Scanner;
public class SandGlass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		for(int i=1;i<=n-4;i++) {
			for(int j=1;j<=(n-4)-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=n-4;i++) {
			for(int j=i;j>=1;j--) {
		
				System.out.print("*");
			}
			System.out.println();
		}

			}


	}


