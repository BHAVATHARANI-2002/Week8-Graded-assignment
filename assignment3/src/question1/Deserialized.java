package question1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Deserialized 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{

		// to get the object returned from the file
		Map<Project, ArrayList<Employee>> obj = null; 

		FileInputStream file = new FileInputStream("File.txt");

		ObjectInputStream ois = new ObjectInputStream(file);
		obj=(Map<Project, ArrayList<Employee>>) ois.readObject();
		ois.close();

		for(Entry<Project, ArrayList<Employee>> temp : obj.entrySet())
		{
			System.out.println("The project");
			System.out.println(temp.getKey()+" Has the following employees");
			System.out.println("Employees..");
			for(Employee t : temp.getValue())
			{
				System.out.println(t);
			}
		}
	}
}