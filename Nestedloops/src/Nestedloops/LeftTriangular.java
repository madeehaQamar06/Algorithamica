package Nestedloops;
import java.util.*;
public class LeftTriangular {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		for(int row = 1;row<=n;row++) {//rows
			for(int k =1;k<=n-row+1;k++) {//spaces
				System.out.print(" ");
			}
			for(int j = 1;j<=row;j++) {//stars
				System.out.print("*");
			}

	
		System.out.println("\n");
	}

}
}

