package branching;
import java.util.*;
public class Seasons {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String month;
		System.out.println("enter month");
		month = s.next();
		int date;
		System.out.println("enter date");
		date = s.nextInt();
		if(month.equals("march") && date==20) {
		System.out.println("spring");
		}
		else if(month.equals("june") && date==21) {
			System.out.println("summer");
		}
		else if(month.equals("sept") && date==22) {
			System.out.println("fall");
		}
		else if(month.equals("dec") && date==21) {
			System.out.println("winter");
		}

	}

}