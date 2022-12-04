package project1;
import java.util.*;
public class SumPositive {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n, sum=0;
		n = s.nextInt();
		sum = ((n)*(n+1))/2;
		System.out.println("sum is " + sum);
	}

}
