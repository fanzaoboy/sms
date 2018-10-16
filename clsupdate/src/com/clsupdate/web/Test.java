package com.clsupdate.web;

import org.apache.log4j.Logger;

public class Test {

	private static Logger log = Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		log.debug("DEBUG INFO");
		log.error("ERROR INFO");
	}
}
