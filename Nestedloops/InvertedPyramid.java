package Nestedloops;
import java.util.*;
public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
