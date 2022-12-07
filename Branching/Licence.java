package branching;
import java.util.*;
public class Licence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter licence");
		String str = s.next();
		if(str.length()==6 && Character.isUpperCase(str.charAt(0))  && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(2))
			  && Character.isDigit(str.charAt(3))&& Character.isDigit(str.charAt(4)) && Character.isDigit(str.charAt(5))) {
			System.out.println("old license");
		}
		else if(str.length()==7 && Character.isDigit(str.charAt(0))  && Character.isDigit(str.charAt(1)) && Character.isDigit(str.charAt(2))
			  && Character.isDigit(str.charAt(3))&& Character.isUpperCase(str.charAt(4)) && Character.isUpperCase(str.charAt(5))  && Character.isUpperCase(str.charAt(6))) {
			System.out.println("new license");
		}
		else {
			System.out.println("enter valid license");
		}
		

	}

}
