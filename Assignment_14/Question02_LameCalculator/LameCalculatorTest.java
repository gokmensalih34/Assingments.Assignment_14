package Assingments.Assignment_14.Question02_LameCalculator;

public class LameCalculatorTest {

	public static void main(String[] args) {
	
		LameCalculator lc = new LameCalculator();
		
		System.out.println("Addition"+ "\t" +"--> " + lc.plus(1, 1));
		System.out.println("Subtruction"+ "\t" +"--> " + lc.minus(1, 1));
		System.out.println("Multiplication"+ "\t" +"--> " + lc.multiply(2, 1));
		System.out.println("Division"+ "\t" +"--> " + lc.divide(10, 2));

	}

}
