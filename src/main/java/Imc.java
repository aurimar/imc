/**
 *
 * @author aurimarmiranda
 */

public class Imc {
	
	public static double calculoImc(double altura,double peso){
		
		double result;
		
		result = peso/ (altura * altura);
		return result;

	}

}
