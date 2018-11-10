/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obydul.calculator;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author bts-2
 */
public class CalculatorTest {

    @Test
    public void testAdd_int_int() {
        System.out.println("add");
        int a = 5;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 7;
        int result = instance.add(a, b);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd_intArr() {
        System.out.println("add");
        int[] values = {1, 2, 3, 4, 5};
        Calculator instance = new Calculator();
        int expResult = 15;
        int result = instance.add(values);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }

}
