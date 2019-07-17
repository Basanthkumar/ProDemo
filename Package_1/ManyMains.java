package Package_1;

public class ManyMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in first main method");
		// main method must always be void
		//The reason for the main method having void as return type is that once main finishes,
		//it doesn't necessarily mean that the entire program finished. If main spawns new threads, 
		//then these threads can keep program running. The return type of main doesn't make much sense at this point.
	}
	
}


class Manymains2{
	public static void main(String[] sharath){
		
		System.out.println("I am in second Main method ");
		ManyMains.main(sharath);
		//Note there can be any number of main in different classes
		// its our wish , that which main we want to execute in JAVA
		
	}
}