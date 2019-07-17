package Package_1;
interface Interface1 
{
	public void printUsingInterface();
	// Return Type of the method must 
}

class ImplemementingInterface implements Interface1
{
	public void printUsingInterface(){
		System.out.println("I am an interface method implemented using Class");
	}
	public void MethodOfClass()
	{
	System.out.println("I am in the method of the class");	
	}
}


public class Interface_HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 A = new ImplemementingInterface();
		// An Object of the interface cannot be created , only reference for the interface methods can be created 
		A.printUsingInterface();
		// here using the reference of A , we cannot access the methods of ImplemementingInterface class
		// A seperate object needs to be created for ImplementingInterface Class
		System.out.println("I am in class ImplemementingInterface");
		ImplemementingInterface A1 = new ImplemementingInterface();
		A1.printUsingInterface();
		A1.MethodOfClass();
		
	}

}
