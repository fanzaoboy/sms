package com.sms.Utils;

public class IDUtil {
	public static String RandomNum() {
		
		int code = (int) (Math.random() * (400000000 - 100000000)) + 100000000;
		String codeStr = String.valueOf(code);
		return codeStr;
	}
}
