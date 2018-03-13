package dev.console;

import dev.utils.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        int result = StringUtils.levenshteinDistance("tra", "tr");
        System.out.println( "Résultat : " + result );
    }
}
