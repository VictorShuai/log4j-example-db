package org.vs.log4j.example;

import java.util.Random;

import org.apache.log4j.Logger;

public class Log4jExample {
	
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		
		logger.info("主线程中的日志信息..");
		
		for (int i=0; i<10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					Random random = new Random();
					long sleepTime = (random.nextInt(10) + 1) * 1000;
					try {
						Thread.sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					logger.debug("这是线程中的日志信息");
				}
			}).start();
		}
		
	}
	
}
