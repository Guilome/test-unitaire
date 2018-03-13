/**
 * 
 */
package dev.test;

import dev.utils.StringUtils;

/**
 * @author ETY0004
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		// Test 1
		int distanceL = StringUtils.levenshteinDistance("haha", "hoho");
		if(distanceL != 2){
			throw new RuntimeException("La distance est incorrect");
		}
		System.out.println( "Test 1 -> résultat : " + distanceL );
		
		// Test 2
		distanceL = StringUtils.levenshteinDistance("tra", "tr");
		if(distanceL != 1){
			throw new RuntimeException("La distance est incorrect");
		}
		System.out.println( "Test 2 -> résultat : " + distanceL );
		
		// Test 3
		distanceL = StringUtils.levenshteinDistance("t", "t");
		if(distanceL != 0){
			throw new RuntimeException("La distance est incorrect");
		}
		System.out.println( "Test 3 -> résultat : " + distanceL );

		// Test 4
		distanceL = StringUtils.levenshteinDistance(null, null);
		if(distanceL != 0){
			new RuntimeException();
		}
		System.out.println( "Test 4 -> résultat : " + distanceL );
	}

}
