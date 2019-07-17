package Package_1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileReader f = new FileReader("E:\\hello.txt");
/*FileOutputStream fos = new FileOutputStream(f);
DataOutputStream dos = new DataOutputStream(fos);
dos.writeUTF("I am in the file");

FileInputStream fis = new FileInputStream(f);
DataInputStream dis = new DataInputStream(fis);
String s = dis.readUTF();
System.out.println(s);*/

BufferedReader br = new BufferedReader(f);
System.out.println(br.readLine());
System.out.println(br.readLine());
System.out.println(br.readLine());
System.out.println(br.readLine());

	}

}
