package repitition;
import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int num = s.nextInt();
		float sum=0;
		while(num>0) {
			float rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println("sum is " + sum);

	}

}
