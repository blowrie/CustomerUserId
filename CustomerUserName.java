import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		String fName, lName, favFood, remainder;
		int phoneNumber;
	
		
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter your first name");
	fName = reader.nextLine();
	System.out.println("Enter your last name");
	lName = reader.nextLine();
	System.out.println("What is your favorite food?");
	favFood = reader.nextLine(); 
	System.out.println("Enter your last 4 digits of your phone number");
	phoneNumber = reader.nextInt();
	
	System.out.println("Thank you, " + fName + " " + lName + " We will now tell you your custom UserID");
	
	if(phoneNumber % 2 == 0) {
		remainder = "even";
	} else {
		remainder = "odd";
	}
	
	String[] fNameSplit = fName.split("");
	String[] lNameSplit = lName.split("");
	
	System.out.print("Your custom user name is: " + fNameSplit[0] + lNameSplit[0] + favFood + remainder);
	}
}