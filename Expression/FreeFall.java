package project1;
import java.util.*;
public class FreeFall {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the height");
		double H = s.nextDouble();
		double Vi= 0, a = 9.8,d,Vf,formula ;
		System.out.println("Distance is");
		d = s.nextDouble();
		formula = (Vi*Vi) + 2*a*d;
		Vf = Math.sqrt(formula);
		System.out.println("final speed is" + Vf);
	}

}
