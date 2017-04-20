package myJavaApp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class School 
{
@XmlElement(name="student")
	private List<Student> std;

public List<Student> getStd() {
	return std;
}

public void setStd(List<Student> std) {
	this.std = std;
}

@Override
public String toString() {
	return "School [std=" + std + "]";
}

}
