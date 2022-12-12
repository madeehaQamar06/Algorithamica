package repitition;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int q = s.nextInt();
		String result = " ";
		while(q>0) {
			int r = q%2;
			q = q/2;
			
			result += r;
			
		}
		for(int i=result.length();i>0;i--) {
			System.out.print(result.charAt(i-1));
			
		}
		
		}
	}
	

