package Package_1;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =5;
		Integer obj10 = new Integer(i);
		System.out.println(obj10);
		
		Integer obj11 = new Integer(i);
		System.out.println(obj11);
		
		int j;
		j = obj10+obj11;
		Object obj12 ;
		obj12 =obj10+obj11; 
		System.out.println(obj12);
		System.out.println(j);
		
		String s = "1";
		int k = Integer.parseInt(s);
		System.out.println(k);
		Integer l = Integer.valueOf(i);
		System.out.println(l);
		l.compareTo(obj11);
	}

}
