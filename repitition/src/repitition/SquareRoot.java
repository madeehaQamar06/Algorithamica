package repitition;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter x");
		int x = s.nextInt();
		int guess = x/2;
		while (Math.abs(guess * guess - x) >= Math.pow(10,-12)){
			 guess = (guess + x/guess)/2;
		}
		System.out.println("square root is" +guess);
		}
	}
	



