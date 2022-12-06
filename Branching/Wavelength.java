package branching;
import java.util.*;
public class Wavelength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter wavelength");
		int w;
		w = s.nextInt();
		if(w >= 380 && w <= 450) {
			System.out.println("voilet wavelength");
		}
		else if(w >= 450 && w <= 495) {
			System.out.println("blue wavelength");
		}
		else if(w >= 495 && w <= 570) {
			System.out.println("green wavelength");
		}
		else if(w >= 570 && w <= 590) {
			System.out.println("yellow wavelength");
		}
		else if(w >= 590 && w <= 620) {
			System.out.println("orange wavelength");
		}
		else if(w >= 620 && w <= 750) {
			System.out.println("red wavelength");
		}
		

	}

}