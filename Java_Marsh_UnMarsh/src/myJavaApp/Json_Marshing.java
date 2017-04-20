package myJavaApp;

import java.io.File;
import java.io.FileWriter;

import com.google.gson.Gson;

public class Json_Marshing {

	public static void main(String[] args) {
School sc=new School();
Gson g=new Gson();
String json=g.toJson(sc);
System.out.println("to json file"+json);
File f=new File("myPojo.json");
try(FileWriter wr=new FileWriter(f))
{
	g.toJson(sc,wr);
}
catch(Exception e)
{
	e.printStackTrace();
}
System.out.println("file created ");
		
	}

}