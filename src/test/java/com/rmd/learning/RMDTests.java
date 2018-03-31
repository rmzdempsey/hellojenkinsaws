package com.rmd.learning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class RMDTests {

    @Before
    public void before(){
        System.out.println("RMD before");
    }

    @Test
    public void testOne(){
        System.out.println("RMD test 1");
        assertTrue( true );
    }

    @Test
    public void testTwo(){
        System.out.println("RMD test 2");
        assertTrue( true );
    }

    @After
    public void after(){
        System.out.println("RMD after");
    }
}
