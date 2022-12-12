package repitition;
import java.util.*;
public class Cipher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.next();
		int k = 3;
		int res =0;
		for(int c=0;c<=str.length();c++) {
			int pos = str.charAt(c);
			pos = 'a' + k;
			pos = (pos+k)%26;
					res += 'a' + pos;
		}
		System.out.println("result" + res);

	}

}
