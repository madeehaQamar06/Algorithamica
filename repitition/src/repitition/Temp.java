package repitition;
import java.util.Formatter; 
public class Temp {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();  
		fmt.format("%15s %15s \n","celsius" , "fahrenheit" );
		for(int  c=0;c<=100;c+=10) {
			int  Fahrenheit =((c*9)/5)+32;
			
			fmt.format("%14s %14s \n", c, Fahrenheit);
		}
		System.out.println(fmt);
	}
}

