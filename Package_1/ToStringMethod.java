package Package_1;


public class ToStringMethod {

	public static void main(String[] args) {
		
		Student obj5 = new Student(2,"Sharath");
		System.out.println("The rollnumber is "+obj5.rollnumber);
		System.out.println("The Name is "+obj5.NameOfStudent);
		System.out.println("The object address is "+obj5);// the statement gives the address of Package and class
		//if the toString method is not specified
		//if want access the object it will default calls the method toString();
		//toString gives the address of the class and package

	}

}


class Student{
	int rollnumber;
	String NameOfStudent;
	Student(int rollnumber,String NameOfStudent){
		this.rollnumber = rollnumber;
		this.NameOfStudent = NameOfStudent;
		
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", NameOfStudent="
				+ NameOfStudent + "]";
	}
}