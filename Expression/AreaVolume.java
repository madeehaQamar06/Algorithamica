package project1;
import java.util.*;
public class AreaVolume {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r;
		System.out.println("enter radius");
		r = s.nextDouble();
		double A,V;
		A = 3.14 * r *r;
		V = 3.14 * 1.33 * r * r * r;
		System.out.println("area of circle is" + A);
		System.out.println("volume of sphere is" + V);

	}

}
