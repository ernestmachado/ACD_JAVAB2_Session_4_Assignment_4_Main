package ASSIGNMENTS;

//Write a program to demonstrate Constructor chaining in Java.
public class ConstructorChaining {
	// This is the default constructor of the class
	public ConstructorChaining() {
		System.out.println("1. Default constructor");
	}

	// This constructor of the class ConstructorChaining accepts a string
	// argument
	public ConstructorChaining(String str) {
		this(); // Call to the Default constructor
		System.out.println("2. Constructor with 1 argument");
	}

	// This constructor of the class ConstructorChaining accepts a string and a
	// integer as argument
	public ConstructorChaining(String str, int num) {
		// It will call the constructor with String argument
		this("Hello");
		System.out.println("3. Constructor with 2 argument");
	}

	// This constructor of the class ConstructorChaining accepts 3 integer as
	// argument
	public ConstructorChaining(int num1, int num2, int num3) {
		// It will call the constructor with (String, integer) arguments
		this("Hello", 2);
		System.out.println("4. Constructor with 3 argument");
	}

	public static void main(String args[]) {
		// Creating an object using Constructor with 3 integer arguments
		System.out.println("Calling Constructor Chaining");
		ConstructorChaining obj = new ConstructorChaining(105,200,2548);
		System.out.println("End of Constructor Chaining");
	}
}