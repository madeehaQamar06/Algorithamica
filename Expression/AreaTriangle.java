package project1;
import java.util.*;

public class AreaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,A;
		System.out.println("enter s1,s2,s3");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		int s = (s1 + s2 + s3)/2;
		A= s * (s-s1)* (s-s2)* (s-s3);
		double SquareRoot = Math.sqrt(A);
		System.out.println("area is "+ A);
	
	}

}