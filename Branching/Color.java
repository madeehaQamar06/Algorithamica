package branching;
import java.util.*;
public class Color {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter input");
		String st;
		st = s.next();
		char col =  st.charAt(0);
		int rows = st.charAt(1);
		int ascivalue = (int)col;
		if((98 - ascivalue)%2 != 0 && rows % 2 !=0) {
			System.out.println("black");
		}
		else if((98 - ascivalue)%2 == 0 && rows % 2 ==0){
			System.out.println("black");
		}
		else if((98 - ascivalue)%2 != 0 && rows % 2 ==0){
			System.out.println("white");
		}
		else if((98 - ascivalue)%2 == 0 && rows % 2 !=0){
			System.out.println("white");
		}
		

	}

}
