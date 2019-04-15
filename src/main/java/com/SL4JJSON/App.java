package com.SL4JJSON;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Logger logger = LoggerFactory.getLogger(App.class);
    	logger.info("I am info level log");
    	
        logger.warn("I am warning level log");
        
        logger.debug("I am debug level log");
        
        logger.error("I am error level log");
        
    }
}
