package project1;
import java.util.*;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Amount of money deposited");
		double D = s.nextDouble();
		double balance;
		System.out.println("balance is" );
		balance = s.nextDouble();
		System.out.println("in a year" + 0.04*balance);
		System.out.println("in a 2 year" + 0.08*balance);
		System.out.println("in a 3 year" + 0.12*balance);
	}

}