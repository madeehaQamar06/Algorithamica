package repitition;
import java.util.*;
public class SumOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter num");
		int num = s.nextInt();
		int sum=0;
		for(int i=1;i <= num+2;i++) {
			if(i%2 == 1) {
				System.out.println(i);
				sum = sum+i;
				

			}
		}
				System.out.println("sum is" + sum);
				
			}
		
		}

	


