package com.sms.web;

import org.apache.log4j.Logger;

import com.sms.Utils.IDUtil;

public class test {

	private static Logger logger = Logger.getLogger(test.class);
	public static void main(String[] args) {
		System.out.println(IDUtil.RandomNum());
		logger.debug("This is Debug message!");
		logger.info("This is Info message!");
		logger.error("This is Error message!");
	}
}
