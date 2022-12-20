package Function2;
import java.util.*;
public class CollinearPoints {
	static boolean isCollinear(int X1,int X2,int X3,
			                     int Y1,int Y2, int Y3){
	    double slope1= (Y2-Y1)/(X2-X1) ;
	     double  slope2 = (Y3-Y2)/(X3-X2);
	     boolean flag=true;
	     if(slope1 == slope2) 
	    	 flag = true;
	     else
	     flag = false;
	return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter points");
		int X1 =s.nextInt();
		int X2 =s.nextInt();
		int X3 =s.nextInt();
		int Y1 =s.nextInt();
		int Y2 =s.nextInt();
		int Y3 =s.nextInt();
		System.out.println(isCollinear(X1,X2,X3,Y1,Y2,Y3));
	}

}
