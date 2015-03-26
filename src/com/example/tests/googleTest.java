package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class googleTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox c:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testGoogle() throws Exception {
		selenium.open("/?gws_rd=ssl");
		selenium.type("id=lst-ib", "sherry");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
