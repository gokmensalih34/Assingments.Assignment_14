package Assingments.Assignment_14.Question07_GasTank;

public class GasTankTest extends GasTank{
	
	public GasTankTest(double amount) {
		super(60);
		
	}

	public static void main(String[] args) {
		
		GasTank gt = new GasTank(60);
		System.out.println(gt.amount);
		gt.addGas(65);
		System.out.println("Current Gas Amount = " + gt.amount);

		gt.useGas(45);
    	System.out.println("Current Gas Amount = " + gt.amount);
    	System.out.println(gt.isEmpty());
		System.out.println(gt.isFull());
		System.out.println(gt.getGasLevel());
		System.out.println(gt.fillUp());
		gt.useGas(50);
		System.out.println(gt.amount);
		System.out.println(gt.isEmpty());
		System.out.println(gt.isFull());
		
		gt.addGas(70);
		System.out.println("Current Gas Amount = " + gt.amount);
		System.out.println("Is it empty= " + gt.isEmpty());
		System.out.println("Is it full= " + gt.isFull());
		
		
		
		
	}


	
	
}
