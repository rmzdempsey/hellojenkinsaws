package com.rmd.learning;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Stream.of("Hello", " ", "WorldZZZ", "/n").forEach(System.out::print);

        //System.out.println( "Hello World!" );
    }

}
