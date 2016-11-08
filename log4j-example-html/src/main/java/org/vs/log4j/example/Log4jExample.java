package org.vs.log4j.example;

import org.apache.log4j.Logger;

public class Log4jExample {
	
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		logger.debug("这是main方法中的日志信息");
		for (int i=0; i<10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					logger.debug("这是线程"+Thread.currentThread().getName()+"中的日志信息");
				}
			}).start();
		}
	}
	
}
