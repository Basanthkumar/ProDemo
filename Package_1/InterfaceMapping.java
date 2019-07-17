package Package_1;

interface Interface3 {
	int method1();

	void method2();

	void method3();
}

interface Interface4 extends Interface3{
	int method1();

	void method4();

	void method5();
}

 class Class5 implements Interface3 {
	public int method1() {
		System.out.println("Method1 in class5");
		return 0;
	}

	public void method2() {
		System.out.println("Method2");

	}

	//abstract
	public void method3()
	{
		System.out.println("Method3 in Class5");
	}

	public void method6() {
		System.out.println("Method6");
	}

}

public class InterfaceMapping extends Class5 implements Interface3, Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceMapping obj = new InterfaceMapping();
		Interface3 obj1 = new Class5();
		Class5 obj2 = new Class5();
	
		obj.method1();
		
		

	}

	public void method3() {
		System.out.println("Method3");
	}

	public void method4() {
		System.out.println("Method4");
	}

	public void method5() {
		System.out.println("Method5");
	}
	public int method1() {
		System.out.println("Method1 in Class InterfaceMapping");
		return 0;
	}

}
