package Function;
import java.util.*;
public class NextPrime {
	static int nextPrime(int prime) {
		 prime++;
	      for (int i = 2; i <=prime-1; i++) {
	         if(prime%i == 0) {
	            prime++;
	            i=2;
	         } else {
	            continue;
	         }
	      }
	      return prime;
	   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter prime");
		int prime = s.nextInt();
		System.out.println( "next prime is " +nextPrime(prime));
		

	}

}
