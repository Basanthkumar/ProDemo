package Package_1;

public class return1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();

	}
	
static int method1()
{
	System.out.println("Hello i am in method1 which returns an integer");
	return 2;
}
static void method2()
{
	System.out.println("hello this is in method2 calling method1 "+method1());
}
}
