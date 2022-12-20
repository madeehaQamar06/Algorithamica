package Function2;
import java.util.*;
public class PerfextNumber {
	static boolean isPerfect(int n) {
		int sum =0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum += i;
				if(sum == n) {
					return true;
					
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		System.out.println(isPerfect(n));
		for(int j=1;j<=10000;j++) {
			if(isPerfect(j))
			System.out.println((j));
		}
		
		

	}

}
