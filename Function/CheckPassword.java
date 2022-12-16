package Function;
import java.util.*;
public class CheckPassword {
	private static final String S = null;
	static boolean checkPassword(String S) {
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
		int passwordLength=8, upChars=0, lowChars=0;
		int digit=0;
		int total = password.length();
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
		     
			return true;
			}
			return false;
		
	}
	public static void main(String[] args) {	
	      System.out.print("Enter the Password");
		System.out.println(checkPassword(S));
	}

}
