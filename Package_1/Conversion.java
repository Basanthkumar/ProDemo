package Package_1;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total1 = 0;
		try{
		String args1[] = {"Sharath","2"};
		System.out.println(args1[0]);
		System.out.println(args1[1]);
		total1 = Integer.parseInt(args1[0])+Integer.parseInt(args1[1]);
		// Note : String to int cannot be casted 
		
		}
		catch(NumberFormatException ex )// Unchecked Exception , when we are adding two Strings
		{
			System.out.println("type in the correct String ");
		}
		
		System.out.println("The total is "+total1);
		

	}

}
