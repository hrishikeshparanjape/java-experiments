package com.rishi.logging;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Hello world!
 *
 */

//This is a facad around slf4j logger which itself is a facad around log4j logger
public class LoggingExperiment 
{
	private static final Logger logger;
    static{
    	logger = LoggerFactory.getLogger(LoggingExperiment.class);
    	PropertyConfigurator.configure("src/main/resources/log4j.properties");
    }
    public static void logInfoMessage(String message) {
    	logger.info(message);
    }
    public static void logDebugMessage(String message) {
    	logger.debug(message);
    }
    public static void logErrorMessage(String message) {
    	logger.error(message);
    }
    public static void logTraceMessage(String message) {
    	logger.trace(message);
    }
}
