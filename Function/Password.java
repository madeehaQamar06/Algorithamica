package Function;
import java.util.*;
public class Password {
		static	boolean isUpper(char c) {
				   return c>='A' && c<= 'Z';
			   }
			static   boolean isLower(char c) {
				   return c>='a' && c<='z';
			   }
			static   boolean isDigit(int c) {
				   return c>='0';
			   }
	 static boolean checkPassword(String str) {
		 int total = str.length();
		 boolean booleanFlag= false;
		 for(int i=0;i<total;i++) {
			 if( total>=8) {
				 booleanFlag = true;
				  if( isUpper(str.charAt(i))) {
					 booleanFlag = true;
				  }
				  if( isLower(str.charAt(i))) {
					 booleanFlag = true;
				 }
			  if( isDigit(str.charAt(i))) {
				 booleanFlag = true;
			 }
			 }
			 else
			 booleanFlag = false;
		 }
		return booleanFlag;
	 }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter password");
		String str;
		str = s.next();
		System.out.println(checkPassword(str));
		

	}

}
