package com.example.pc.unittestingpractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pc on 8/12/2017.
 */
public class MainActivityTest {

    private  MainActivity myCalc;
    @Before
    public void setUp() throws Exception {
        myCalc= new MainActivity();
    }

    @After
    public void tearDown() throws Exception {

    }

    //  @Test(expected=java.lang.ArithmeticException.class)
   // @Test(expected = IllegalArgumentException.class)
    @Test(expected = NullPointerException.class)
    public void divide() throws Exception
    {
       myCalc.divide(32f,0f);

    }

}