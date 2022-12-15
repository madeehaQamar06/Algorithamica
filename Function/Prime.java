package Function;
import java.util.*;
public class Prime {
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		else if(num == 2) {
			return true;
		}
		else if(num % 2==0) {
			return false;
		}
		 for(int i=2;i<=num-1;i++)
	       {
	           if((num % i)==0)
	               return  false;
	       }
	       return true;
	    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("enter num");
		num = s.nextInt();
		 if(isPrime(num)) {
	            System.out.println(num + " is prime number");
	        }
	        else{
	            System.out.println(num + " is a non-prime number");
	        }
		
		
		
		
		
		

	}

}
