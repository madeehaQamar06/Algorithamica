package Strings;
import java.util.*;
public class MysteryLength {
	static String removeMysteryLength(String str) {
		 String strNew = null;
		for(int i=0;i<str.length();i++) {
		  strNew = str.substring(0,str.length()-2);
		}
	    return strNew;
	}


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str = s.next();
		System.out.println(removeMysteryLength(str));
		

	}

}
