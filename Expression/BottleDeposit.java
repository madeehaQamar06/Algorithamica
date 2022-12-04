package project1;
import java.util.*;
public class BottleDeposit {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("no.of containers");
		double c = s.nextDouble();
		double x,y;
		System.out.println("x and y is");
		x = s.nextDouble();
		y = s.nextDouble();
		c = x * 0.10 + y * 0.25;
		System.out.println("refund is " + "$" + c);
	}

}
