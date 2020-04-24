package Assingments.Assignment_14.Question09_Telephone;

public class TelephoneTest extends Telephone{

	public static void main(String[] args) {
		
		Telephone telephone = new Telephone ();
		
		telephone.calledNumber = "0202_1235678";
		System.out.println(telephone.calledNumber);
		System.out.println("-----------");
		
		Telephone.setQuantity(300);
		System.out.println(Telephone.getQuantity());
		System.out.println("-----------");

		telephone.setQuantity(350);
		System.out.println("With Objectname-telefon.getQuantity() = " + telephone.getQuantity());
		System.out.println("With Classname-Telefon.getQuantity() = " + Telephone.getQuantity());		
		System.out.println("-----------");
		
		Telephone.setTotal(320.56);
		System.out.println("With Objectname-telefon.getQuantity() = " + telephone.getTotal());
		System.out.println("With Classname-Telefon.getQuantity() = " + Telephone.getTotal());

	}

}
