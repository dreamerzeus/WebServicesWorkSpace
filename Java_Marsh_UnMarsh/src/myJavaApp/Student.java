package myJavaApp;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={"id","name","fees","mNos"})
public class Student {
private int id;
private String name;
private float fees;
private long[] mNos;
@XmlAttribute(name="Student-Id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@XmlElement(name="Student-Name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement(name="Student-fees")
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}
@XmlElement(name="Student-MobileNos")
@XmlElementWrapper(name="MobileNos")
public long[] getmNos() {
	return mNos;
}
public void setmNos(long[] mNos) {
	this.mNos = mNos;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", mNos=" + Arrays.toString(mNos) + "]";
}

}
