package com.patterns.design.singleton;

import org.apache.log4j.Logger;

public class SingletonMain {

	final static Logger logger = Logger.getLogger("SingletonLogger");

	public static void main(String[] args) {

		try {
			Resource resource = Resource.getInstance();
			// Resource setting the value to 5
			resource.setValue(5);
			System.out.println(resource.getValue());

			// Created another variable which will be pointing to the same
			// object as
			// above
			Resource resourceReplica = Resource.getInstance();
			System.out.println(resourceReplica.getValue());
			// Another reference setting the value to 10
			resourceReplica.setValue(10);
			System.out.println(resourceReplica.getValue());
			System.out.println(resource.getValue());
		} catch (Exception e) {
			logger.error("Exception occurred", e);
			e.printStackTrace();
		}
	}
}
