package com.test.automation.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.automation.common.Page;
import com.test.automation.common.SeHelper;

public class IndexPage extends Page {
	public static By newSubmission = By.xpath("//*[@ng-click='navigateToMultiQuote()']");

	public static WebElement NewSubmission(SeHelper se) throws Exception {
		Thread.sleep(10000);
		return se.element().getElement(newSubmission,true);
	}

}
