package branching;
import java.util.*;
public class VowelConsonant {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter letter");
	char letter;
	letter = s.next().charAt(0);
	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter=='u') {
	System.out.println(" letter is vowel");
	}
	else if(letter == 'y') {
		System.out.println(" letter is sometimes vowel sometimes consonant");
		}
	else {
		System.out.println(" letter is consonant");
		
	}
	}
}
