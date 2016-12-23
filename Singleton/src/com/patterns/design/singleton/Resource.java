package com.patterns.design.singleton;

import org.apache.log4j.*;

public class Resource {

	private static Resource singleInstance = null;
	private int value = 0;
	final static Logger logger = Logger.getLogger("SingletonLogger");

	private Resource() {
	}

	public static Resource getInstance() {
		if (singleInstance == null) {
			singleInstance = new Resource();
			logger.info("Created new instance of resource");
		}
		logger.info("Returning instance");
		return singleInstance;
	}

	public void setValue(int value) {
		logger.info("Setting the attribute");
		this.value = value;
	}

	public int getValue() {
		logger.info("Returning the attribute");
		return this.value;
	}
}
