package Assingments.Assignment_14.Question13_RGB;

public class ColorTest extends Color{

	public static void main(String[] args) {
		

		Color color = new Color();
	    System.out.println(color.toString().toUpperCase() ) ; // prints "white"
	    
	    Color color2 = new Color(255, 0, 0);
		System.out.println(color2.toString().toUpperCase() ) ; // prints "red"
		
		Color color3 = new Color(255, 44, 88); 
		System.out.println(color3.toString().toUpperCase()); // prints "N/A"
		
		Color color4 = new Color(192, 192, 192); 
		System.out.println(color4.toString().toUpperCase()); // prints "light gray"

	}

}
