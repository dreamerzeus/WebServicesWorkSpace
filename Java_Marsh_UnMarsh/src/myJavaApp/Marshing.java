package myJavaApp;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Marshing {

	public static void main(String[] args) {
		try
		{
			Student s1=new Student();
			s1.setName("rahul");
			s1.setId(1);
			s1.setFees(12000);
			s1.setmNos(new long[]{987654321,123456789});
			
			Student s2=new Student();
			s2.setFees(13000);
			s2.setId(2);
			s2.setName("pratap");
			s2.setmNos(new long[]{12345,54321});
			
			List<Student> st1=new ArrayList<Student>();
			st1.add(s1);
			st1.add(s2);
			
			School sc1=new School();
			sc1.setStd(st1);
			
			JAXBContext jaxbContext=JAXBContext.newInstance(School.class);
			Marshaller marshaller=jaxbContext.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(sc1, System.out);
			marshaller.marshal(sc1, new FileOutputStream("School.xml"));
			System.out.println("file created");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
