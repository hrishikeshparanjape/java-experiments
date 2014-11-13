package com.rishi.logging;
import org.junit.*;

import com.rishi.logging.LoggingExperiment;


/**
 * Unit test for simple App.
 */

public class LoggingExperimentTest 
{
	@Test
    public void testLogDebugMessage()
    {
		LoggingExperiment.logDebugMessage("This is a debug message");
    }
	
	@Test
    public void testLogInfoMessage()
    {
		LoggingExperiment.logInfoMessage("This is a info message");
    }
	
	@Test
    public void testLogErrorMessage()
    {
		LoggingExperiment.logErrorMessage("This is an error message");
    }
	
	@Test
    public void testLogTraceMessage()
    {
		LoggingExperiment.logTraceMessage("This is a trace message");
    }
}
