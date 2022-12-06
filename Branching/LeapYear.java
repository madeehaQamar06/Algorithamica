package branching;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter year");
		int year ;
		year = s.nextInt();
		if(year%400 == 0 || year%4 == 0) {
			System.out.println("leap year");
		}
		else if(year%100 == 0) {
			System.out.println("not leap year");
		}
		else {
			System.out.println("remaining is also not leap year");
		}

	}

}
