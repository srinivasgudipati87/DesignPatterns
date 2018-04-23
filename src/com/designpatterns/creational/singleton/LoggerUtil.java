package com.designpatterns.creational.singleton;

import java.io.Serializable;

class Logger implements Serializable, Cloneable {
	private static Logger logger;

	private Logger() {
	}

	public static Logger getInstance() {
		if (logger == null) {
			synchronized (logger) {
				logger = new Logger();

			}
		}

		return logger;

	}
	Object readResolve() {
		return logger;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class LoggerUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
