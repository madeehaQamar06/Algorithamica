package branching;
import java.util.*;
public class MonthToDays {

	public static void main(String[] args) {
		
         Scanner s = new Scanner(System.in);
         System.out.println("enter month");
         String month;
         month = s.next();
         if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("jul")
        		 || month.equals("aug") || month.equals("oct") || month.equals("Dec")){
         
        	 System.out.println("31 days");
         }
         else if(month.equals("april") || month.equals("jun")
        			 || month.equals("sep") || month.equals("nov")){
        		 System.out.println("30 days");
        	 
         }
         else if(month.equals("february")) {
        	 System.out.println("28 days");
        	 
	}
         else {
        	 System.out.println("enter valid month");
         }
         
         
         

	}

}
