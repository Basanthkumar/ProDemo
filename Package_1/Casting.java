package Package_1;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 5555;
double j = 99.6565;
char c = 'a';
String S = "Sharath";

System.out.println(i);
System.out.println((double)i);// int is converted to double
System.out.println((int)j);//double is converted to int 
/*System.out.println((String)c);// char to string not allowed
System.out.println((char)S);// String to char is not allowed
*/
//System.out.println((String)i);// int to String cannot be casted 
	}

}
