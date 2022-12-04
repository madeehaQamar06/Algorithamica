package project1;
import java.util.*;
public class DistanceUnits {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("measurement in feet");
	double feet = s.nextDouble();
	System.out.println("measurement in inches" + 12*feet);
	System.out.println("measurement in yards" + 0.33333*feet);
	System.out.println("measurement in miles" + 0.000189394*feet);
	}

}