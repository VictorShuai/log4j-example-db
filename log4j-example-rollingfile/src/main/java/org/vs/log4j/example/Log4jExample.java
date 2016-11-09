package org.vs.log4j.example;

import org.apache.log4j.Logger;

public class Log4jExample {
	
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		for (int i=0; i<1000; i++) {
			logger.debug("测试日志信息....." + i);
		}
	}
	
}
