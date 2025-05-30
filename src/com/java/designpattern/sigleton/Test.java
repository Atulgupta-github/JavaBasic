package com.java.designpattern.sigleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {
	public static void main(String args []) throws Exception{
		
		Bike b1 = Bike.getBike();
		Bike b2 = Bike.getBike();
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		// break the sigleton pattern object  by reflection api
		/*Constructor<Bike> consstructor= Bike.class.getDeclaredConstructor();
		consstructor.setAccessible(true);
		Bike s2=consstructor.newInstance();
		System.out.println(s2.hashCode());*/
		
		
		// break singleton pattern by serialization and deserialization
		
		Bike bs = Bike.getTheBike();
		
		System.out.println(bs.hashCode());
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(bs);
		System.out.println("---------------serialization done-------------");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		
		Bike bd = (Bike)ois.readObject();
		System.out.println("---------------deserialization done-------------");
		System.out.println(bd.hashCode());
		
		
		
		
	}

}
