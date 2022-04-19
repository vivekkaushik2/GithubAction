package com.test;

import static org.testng.Assert.assertFalse;
import com.lib.Library;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class secondTest {

	@Test
	public void test2() {

		for (int i = 0; i < 200; i++)
			System.out.print("test summaries....");

		Assert.assertTrue(true, "test is passed");
	}

	@Test
	public void test5() {
		assertFalse(true, "test is failed");
	}

	@Test
	public void testskipped() {
		throw new SkipException("skipped");
	}
	
	@Test 
	public void testAdd()
    {
        Library classUnderTest = new Library();
        Assert.assertTrue(classUnderTest.add(1,2)==3, "1+2 should be 3" );
    }
}
