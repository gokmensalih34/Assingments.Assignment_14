package Assingments.Assignment_14.Question09_Telephone;

public class Telephone {
	
	String calledNumber;
	public static int quantity = 250;
	public static double total = 15658.92;

	public String getNumber() {
		return calledNumber;
	}
	public void setNumber(String calledNumber) {
		this.calledNumber = calledNumber;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static void setQuantity(int quantity) {
		Telephone.quantity = quantity;
	}
	public static double getTotal() {
		return total;
	}
	public static void setTotal(double total) {
		Telephone.total = total;
	}

	
	
	
	
	
}
