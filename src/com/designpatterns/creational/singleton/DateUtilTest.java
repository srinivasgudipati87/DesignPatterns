package com.designpatterns.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class DateUtil implements Serializable,Cloneable{

	private static volatile DateUtil instance;
	private DateUtil(){}
	public static DateUtil getInstance() {
		if(instance==null) {
			synchronized(DateUtil.class) {
				if(instance==null) {
					instance=new DateUtil();
				}
			}
		}
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
 public class DateUtilTest{
	 public static void main(String[] s) throws FileNotFoundException, IOException, ClassNotFoundException {
		 DateUtil dateUtil=DateUtil.getInstance();
		 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("ser.txt")));
		 oos.writeObject(dateUtil);
		 
		 DateUtil dateutil2=null;
		 ObjectInputStream oid=new ObjectInputStream(new FileInputStream(new File("ser.txt")));
		 dateutil2=(DateUtil) oid.readObject();
		 
		 System.out.println(dateUtil==dateutil2);
		 System.out.println(dateUtil.hashCode());
		 System.out.println(dateutil2.hashCode());
	 }
 }
