package project1;
import java.util.*;
public class SumDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 4 digit number");
		int a,b,c,d,e,f,num,sum=0;
		num = s.nextInt();
		a = num%10;
		b = num/10;
		c = b%10;
		d = b/10;
		e = d%10;
		f = d/10;
		sum = a+c+e+f;
		System.out.println("sum is" + sum);
	}

}
