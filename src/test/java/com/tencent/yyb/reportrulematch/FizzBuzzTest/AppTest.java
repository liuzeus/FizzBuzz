package com.tencent.yyb.reportrulematch.FizzBuzzTest;

import junit.framework.TestCase;

import com.tencent.yyb.FizzBuzz.App;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	App app = new App(); 
	@Test
	public void testfizzBuzzConvertorforFifteen(){ 

	  Assert.assertEquals("FizzBuzz", app.ReportNumber(45)); 
	}
	
	@Test
	public void testfizzBuzzConvertorforThree(){ 
	  Assert.assertEquals("Fizz", app.ReportNumber(3)); 
	}
	
	@Test
	public void testfizzBuzzConvertorforContainThree(){ 
	  Assert.assertEquals("Fizz", app.ReportNumber(31)); 
	}
	
	@Test
	public void testfizzBuzzConvertorforFive(){ 
	  Assert.assertEquals("Buzz", app.ReportNumber(5)); 
	}
	
	@Test
	public void testfizzBuzzConvertorforALL(){ 
		Assert.assertTrue(app.Conversion().contains("FizzBuzz"));
		Assert.assertTrue(app.Conversion().contains("Fizz"));
		Assert.assertTrue(app.Conversion().contains("Buzz"));
		Assert.assertTrue(app.Conversion().contains("22"));
		Assert.assertFalse(app.Conversion().contains("72"));
	}
}
