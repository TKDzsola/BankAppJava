/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.petrik.bankapplication13t;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dávid
 */
public class SzamlaIT {
    
    public SzamlaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOsszeg method, of class Szamla.
     */
    @Test
    public void testGetOsszeg() {
        System.out.println("getOsszeg");
        Szamla instance = null;
        long expResult = 0L;
        long result = instance.getOsszeg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSzamlaszam method, of class Szamla.
     */
    @Test
    public void testGetSzamlaszam() {
        System.out.println("getSzamlaszam");
        Szamla instance = null;
        String expResult = "";
        String result = instance.getSzamlaszam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOsszeg method, of class Szamla.
     */
    @Test
    public void testSetOsszeg() {
        System.out.println("setOsszeg");
        long osszeg = 0L;
        Szamla instance = null;
        instance.setOsszeg(osszeg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
