package Package_1;

public class PalindromeOfANumber {

	public static void main(String[] args) {
		
		int number =242 ;
		int num  = number;
		
		
		 int reverse =0 ;
		
		while (num!=0)
		{
			reverse = reverse*10;
			reverse = reverse + num%10;
		num=num/10;
		
		
		
		}
		
	if(number==reverse)
	{
		System.out.println("The number is a palindrome");
	}else
		System.out.println("The number is not a palindrome");

	}

}
