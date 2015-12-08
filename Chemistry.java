import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculate {

	public static final double GAS_CONSTANT = .0820574;

	public static void main(String[] args) throws FileNotFoundException {
	
		System.out.println(molarmassDensityConversion(130, 1.02, 1, 1.56));
	}
	
	public static double molarmassDensityConversion(double t, double v, double p, double m) {
		return (m/v)*(GAS_CONSTANT*(t+273)/p);
	}
	
	public static double rateLaw(double t1, double t2, double c1, double c2) {
		return (Math.log(c2) - Math.log(c1)) / ((t2-t1));
	}
	
	public static double rateConstant(double init, double t, double halfLife) {
		return init / (Math.pow(2, (t/halfLife)));
	}
	
	public static double halfLife(double halfLife) {
		return Math.log(2) / halfLife;
	}

	public static double limitingReactant(double g, double mm, double v) {
		return (g / mm) / v;
	}

	public static double partialPressure(double v, double m, double mm, double t) {
		return ((m / mm) * GAS_CONSTANT * (t + 273) / v);
	}
	
	public static double reactantInSolution(double mol, double mm1, double v) {
		return (mol * v) * mm1;
	}

	public static double reactantInSolution(double m1, double mm1, double mm2,
			double v) {
		return ((m1 / mm1) * mm2) / v;
	}
}
