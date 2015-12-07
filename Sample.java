import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Calculate {

	
	public static final double GAS_CONSTANT = .0820574;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		
		
	}
	
	
	
	
	public static double partialPressure(double v, double m, double mm, double t) {
		double answer = 0.0;
		
		answer = (m/mm) * GAS_CONSTANT * (t+273);
		
		return (answer/v);
		
		
		/*
		 * double pp1 = partialPressure(9, 9.07, 44.01, 9.21);
		double pp2 = partialPressure(9, 18, 108.07,  9.21);
		double total = pp1 + pp2;
		System.out.println("mol1 " + pp1/total);
		System.out.println("PP1 "+  pp1);
		System.out.println("mol2 " + pp2/total);
		System.out.println("PP2 " + pp2);
		
		System.out.println("Total " + total );
		 */
	}
	
}
