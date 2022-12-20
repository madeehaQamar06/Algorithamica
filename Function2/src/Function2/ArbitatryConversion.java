package Function2;
import java.util.Scanner;
public class ArbitatryConversion {
	static int convertBase(int n,int sourcebase,int destinationbase) {
		int deci = toDecimal(n,sourcebase);
		int finalnum = toDesti(deci,destinationbase);
		return finalnum;
	}
	static int toDecimal(int n,int sourcebase) {
		int decimal = 0;
		int pow = 0;
		while(n>0) {
			int rem = n%10;
			decimal += rem*Math.pow(sourcebase,pow);
			pow += 1;
			n = n/10;	
		}
		return decimal;
		
	}
	static int toDesti(int deci,int destinationbase) {
		int finalnum=0;
		int pow=0;
		while(deci>0) {
			int rem = deci%destinationbase;
			finalnum += rem*Math.pow(10, pow);
			pow += 1;
			deci = deci/destinationbase;
		}
		return finalnum;
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter num");
	int n = s.nextInt();
	System.out.println("enter source base");
	int sourcebase = s.nextInt();
	System.out.println("enter destination base");
	int destinationbase = s.nextInt();
	System.out.println(convertBase(n,sourcebase,destinationbase));
	}

}
