package Package_1;

import java.util.Scanner;

public class StringHandsOn2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] Names = new String[5];
		String[] Reverse1 = new String[]{"","","","",""};
	
		System.out.println("Enter The Name");
		for(int i=0;i<=4;i++)
		{
			Names[i]= input.nextLine();
			if((Names[i].length()==1)||(Names[i].isEmpty())){
				System.out.println("Please enter String Containing atleast Two character");
				i=--i;
			}
		}
		for(int j=0;j<=4;j++)
		{
			System.out.println("The Names are"+" "+Names[j]);
		}
		for(int k=0;k<=4;k++)
		{
			for(int l=Names[k].length()-1;l>=0;l--)
			{
			Reverse1[k] = Reverse1[k]+Names[k].charAt(l);
		}
			//System.out.println("Reverse String is "+Reverse1[k]);
			if(Reverse1[k].equals(Names[k]))
			System.out.println("The Name"+"  "+Names[k]+"  "+"Is a Palindrome");
			else System.out.println("The Name"+"  "+Names[k]+"  "+"Is not  a Palindrome");
	}

}}