package branching;
import java.util.*;
public class BirthdateAstrological {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		String m;
		int date;
		System.out.println("enter date");
		m = s.next();
		date = s.nextInt();
		if((m.equals("dec") && date >= 22) || (m.equals("jan") && date <= 19)) {
			System.out.println("capricon");
		}
		else if((m.equals("jan") && date >= 20) || (m.equals("feb") && date <= 18)) {
			System.out.println("Aquaris");
		}
		else if((m.equals("feb") && date >= 19) || (m.equals("mar") && date <= 20)) {
			System.out.println("pisces");
		}

	}

}
