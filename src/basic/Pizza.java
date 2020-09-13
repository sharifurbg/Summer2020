package basic;

public class Pizza {


	// Non static global variable
	String birthDayBoy = "Mahmud";
	int dataOfBirth = 12;
	String partyName = "BirthDay Party";
	String date = "12th August";
	String pizzaName;

	// Static global variable
	static int orderQty = 10;
	static char pizzaSize = 'L';

	public static void main(String[] args) {
		
		// Object Name could be anything but should be relevant to className
		// Steps
		// Create object
		// call by objectName

		// 
		System.out.println(Pizza.orderQty);
		// For Non Static we have to create object
		Pizza birthDayPizza = new Pizza();
		System.out.println(birthDayPizza.birthDayBoy);

		
	}

}	
	
	
	
	
	
	
	

