package project1;
import java.util.*;
public class TaxTip {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter cost" );
		double cost;
		cost = s.nextDouble();
		double Tax,Tip;
		Tax = 0.18*cost;
		Tip = Tax - (0.05*cost);
		double Total = Tax + Tip;
		System.out.println("Total is" + Total);
	}

}
