package repitition;
import java.util.*;
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.next();
		char c;
		for(int i=0;str.charAt(i) != '\0';++i) {
			c = str.charAt(i);
			if(c == 'a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("vowel");
			}
			else {
				System.out.println("consonant");
			}
			
		}


	}

}
