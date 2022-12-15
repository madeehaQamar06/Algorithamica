package Function;
import java.util.*;
public class Hypotheneus {
	 static double getHypotenuse(int s1,int s2){
		return (int) Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x , y;
		System.out.println("enter x and y");
		x = s.nextInt();
		y = s.nextInt();
		double H = getHypotenuse( x, y);
		 System.out.println("The length of the hypotenuse is: " + H);

	}

}
