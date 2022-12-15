package Function;
import java.util.*;
public class ValidTriangle {
	static boolean isValidTriangle(int s1,int s2,int s3) {
		if(s1+s2>=s3) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int s1,s2,s3;
		System.out.println("enter s1,s2,s3");
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
		System.out.println(isValidTriangle(s1,s2,s3));

	}

}
