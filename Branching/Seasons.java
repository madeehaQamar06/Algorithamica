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
		if(month.equals("january") ||month.equals("february")) {
		System.out.println("winter");
		}
		else if((month.equals("december") && date>=21) ||(month.equals("march")&& date<=20)){
			System.out.println("winter");
		}
		else if(month.equals("april")||month.equals("may")) {
			System.out.println("spring");
		}
		else if((month.equals("march") && date>20) ||(month.equals("june")&& date<=21)){
			System.out.println("spring");
		}
		else if(month.equals("july")||month.equals("august")) {
			System.out.println("summer");
		}
		else if((month.equals("june") && date>21) ||(month.equals("september")&& date<=22)){
			System.out.println("summer");
		}
		else if(month.equals("october")||month.equals("november")) {
			System.out.println("fall");
		}
		else if((month.equals("september") && date>21) ||(month.equals("december")&& date<=21)){
			System.out.println("summer");
		}
			

	}

}
