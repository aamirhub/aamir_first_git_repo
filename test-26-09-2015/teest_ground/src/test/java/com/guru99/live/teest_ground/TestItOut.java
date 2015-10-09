package com.guru99.live.teest_ground;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestItOut {

	public static Logger logger = LogManager.getLogger(TestItOut.class.getName());
	
	
	public static void main(String[] args) {
		DOMConfigurator.configure("C:\\TrainCentre\\TutorialCodes\\JavaCodes\\BatchC2015\\test-26-09-2015\\teest_ground\\src\\test\\java\\log4j.xml");
		
		logger.info("He is crying");

	}

}
