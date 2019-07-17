package Package_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClassSerialize obj2 = new ClassSerialize();
		File f = new File("serialize.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj2);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassSerialize obj3 =(ClassSerialize)ois.readObject();
		
		System.out.println("The Value of is "+obj3.i);
		
		obj3.print();
		
			}

}


class ClassSerialize implements Serializable{
	// Serialization is done to save the object and its values 
	int i = 29347 ;
	String s = "Sharath";
	void print(){
		System.out.println("hello am i serializable");
	}
}