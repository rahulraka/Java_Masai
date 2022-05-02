package Eval4.ques3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	
	public static void main(String[] args) {
		
		Address a1=new Address("Delhi", "110044", "New Delhi");
		
		Employee emp1=new Employee("123", "Rahul", a1, "ask@email.com","123456");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		FileInputStream fin=new FileInputStream("emp.txt");
		ObjectInputStream oo=new ObjectInputStream(fin);
		System.out.println(oo.readObject());
	}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception i) {
			i.printStackTrace();
		}
		
	}
	
}
