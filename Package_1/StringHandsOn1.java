package Package_1;

public class StringHandsOn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Sharath";
		String s2 = "Guru";
		String s3 = "Sharath";
		String s4 = new String("Sharath");
		String s5 = new String("Sharath");
		// Note == operator verifies whether the memory has the same String 
		// Note ,equals() method wont go to memory , it only checks whether the Strings are matching with each each other
		if(s1==s2){
			System.out.println("s and s2 are exactly equal ");
		}
		else if (s1==s3){
			System.out.println("s1 and s3 are Exactly equal");
		}
		else if (s1==s4){
			System.out.println("s1 and s4 are exactly equal");
					}
		else if (s5==s4){
			System.out.println("s5 and s4 are exactly equal");
					}
		System.out.println("using equals method");
		if(s1.equals(s3)){
			System.out.println("s and s2 are exactly equal");
		}
		if(s4.equals(s5)){
			System.out.println("s4 and s5 are exactly equal");
		}
	}

}
