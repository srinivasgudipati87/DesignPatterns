package com.designpatterns.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Logger2 implements Serializable, Cloneable {
	private static Logger2 logger2;

	private Logger2() {
	}

	public static Logger2 getInstance() {
		if (logger2 == null) {
			synchronized (Logger2.class) {
				logger2 = new Logger2();

			}
		}

		return logger2;

	}
	Object readResolve() {
		return logger2;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
enum Logger3{
	INSTANCE;
}

public class LoggerUtil {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Logger2 logger=Logger2.getInstance();
		Logger2 sampleLogger=null;
		Constructor[] constructor=Logger2.class.getConstructors();
		for(Constructor construct:constructor) {
			construct.setAccessible(true);
			sampleLogger=(Logger2)construct.newInstance();
		}
		System.out.println(logger==sampleLogger);
		System.out.println(logger.hashCode());
		System.out.println(constructor.hashCode());
		Logger3 logger3=Logger3.INSTANCE;

	}

}
