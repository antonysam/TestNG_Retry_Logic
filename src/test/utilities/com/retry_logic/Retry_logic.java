package com.retry_logic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer {
	int count = 0;
	int retrylimit = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retrylimit) {
			count++;
			return true;
		}
		return false;
	}

}
