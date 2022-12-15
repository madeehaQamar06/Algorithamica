package Function;
import java.util.*;
public class CheckPassword {
	static boolean checkPassword(int good) {
		//String password;
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
		int passwordLength=8, upChars=0, lowChars=0;
		int digit=0;
		int total = password.length();
		//if(total >= 8) {
		//	System.out.println("valid");
		
		//else {
		for(int i=0;i<total;i++) {
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch)) {
			upChars=1;
			}
			else if(Character.isLowerCase(ch)) {
				lowChars=1;
				
			}
			else if(Character.isDigit(ch)) {
				digit =1;
			}

		}
			if(upChars==1 && lowChars==1 && digit==1&&total>=8) {
		         System.out.println("\nThe Password is Strong.");
			return true;
			}
		  // else {
		        // System.out.println("\nThe Password is Weak.");
			return false;
		
		}
		



		
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter the Password: ");
	      String password = s.nextLine();
	      char good = 0;
		System.out.println(checkPassword(good));
	}

}
