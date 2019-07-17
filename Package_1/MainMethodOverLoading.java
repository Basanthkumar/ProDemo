package Package_1;

public class MainMethodOverLoading {

	
	static int variable;
	CallingDifferentMains obj = new CallingDifferentMains();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" First class ,First main method");
		CallingDifferentMains obj = new CallingDifferentMains();
		obj.print();
// can overload main method in Java. But the program doesn't execute the overloaded main
//method when you run your program, you have to call the overloaded main method from the actual main method.
		
	}
	public static void main(String args2) {
		// TODO Auto-generated method stub
		System.out.println(" First class ,Second main method");
	}
	public static void main(String args3[] , String arg4[]) {
		// TODO Auto-generated method stub
		System.out.println(" First class ,Third main method");
	}
}


class CallingDifferentMains{
	
	void print(){
		String[] args = new String[]{"sharath"};
		//MainMethodOverLoading.main(args);
				//if we try to call the above method , then it is a infinte loop, since JVM first see the statement of type
		//public static void main(String args[])
		String s = "Sharath";
		MainMethodOverLoading.main(s);
		MainMethodOverLoading.main(args, args);
		
	}
}