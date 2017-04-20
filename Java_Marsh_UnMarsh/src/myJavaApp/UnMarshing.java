package myJavaApp;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileReader;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshing {

	public static void main(String[] args) {
		try
		{
			JAXBContext jaxbContext=JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student)unmarshaller.unmarshal(new FileReader("Student.xml"));
			System.out.println("data in xml");
			System.out.println(student.getName());
			System.out.println(student.getId());;
			System.out.println(student.getFees());
			System.out.println(student.getmNos());		
		}
		catch (Exception e) {
        e.printStackTrace();
		}
	

	}

}
