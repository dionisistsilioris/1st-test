/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author g.irakleidis
 */
public class SomeClassTest {
    
    public SomeClassTest() {
    }
     /**
     * Test of getSum method, of class SomeClass.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        SomeClass instance = new SomeClass(5,5);
        int expResult = 10;
        int actualResult = instance.getSum();
        assertEquals(expResult, actualResult);

    }

    /**
     * Test of getQuotient method, of class SomeClass.
     */
    @Test
    public void testGetQuotient() {
        System.out.println("getQuotient");
        SomeClass instance = new SomeClass(5,5);
        double expResult = 1.0;
        double actualResult = instance.getQuotient();
        assertEquals(expResult, actualResult, 0.001);
    }

    /**
     * Test of getProduct method, of class SomeClass.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        SomeClass instance = new SomeClass(5,5);
        int expResult = 25;
        int actualResult = instance.getProduct();
        assertEquals(expResult, actualResult);
    }
    
}
