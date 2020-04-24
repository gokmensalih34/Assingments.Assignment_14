package Assingments.Assignment_14.Question07_GasTank;

public class GasTank {
	
	double amount=0;
	double capacity;
	
	public GasTank (double capacity) {
		this.capacity=capacity;
	}


	public void addGas(double additionalGas) {
		amount+=additionalGas;
		if (amount>=capacity) {
			amount=capacity;
			
		}
		
	}
	
	public void useGas (double usedGas) {
		if(usedGas>=amount) {
			amount = 0;
			
		}else {
		amount-=usedGas;
		}
	}
	
	
	public boolean isEmpty (){
		boolean bool;
		if (amount<0.1) {
			bool = true;
			return bool;
		}else {
			bool = false;
			return bool;
		}

	}
	
	public boolean isFull (){
		boolean bool;
		if (amount > (capacity-0.1)) {
			bool = true;
			return bool;
		}else {
			bool = false;
			return bool;
		}

	}
	
	public double getGasLevel () {
		return amount;
	}
	
	public double fillUp () {
		return (capacity-amount);
	}
	
	
	
}
