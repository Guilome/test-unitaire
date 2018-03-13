/**
 * 
 */
package dev.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dev.utils.StringUtils;

/**
 * @author ETY0004
 *
 */
public class StringUtilsTest {

	int distanceL = 0;
	
	@Test
	public void levenshteinDistanceTest() {
		// Test 1
		distanceL = StringUtils.levenshteinDistance("haha", "hoho");		
		assertEquals(2, distanceL);
				
		// Test 2
		distanceL = StringUtils.levenshteinDistance("tra", "tr");
		assertEquals(1, distanceL);
		
		// Test 3
		distanceL = StringUtils.levenshteinDistance("t", "t");
		assertEquals(0, distanceL);
		
		/*
		// Test 4
		distanceL = StringUtils.levenshteinDistance(null, null);
		*/
		
	}
	@Test (expected = RuntimeException.class)
	public void nullExceptionTest() {
		distanceL = StringUtils.levenshteinDistance(null, "t");
		/* Need 2 more method to be tested
		distanceL = StringUtils.levenshteinDistance("t", null);
		distanceL = StringUtils.levenshteinDistance(null, null);
		*/
	}

}
