package branching;
import java.util.*;
public class ClassifyTriangles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("display 3 sides");
		int l1,l2,l3;
		l1 = s.nextInt();
		l2 = s.nextInt();
		l3 = s.nextInt();
		if(l1 == l2 && l1 == l3 && l2==l3 ) {
			System.out.println("Equilateral triangle");
		}
		else if(l1 == l2 || l1 == l3){
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
		
		
			
		}

	}
