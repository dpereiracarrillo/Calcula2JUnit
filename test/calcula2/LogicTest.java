/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Daniel
 */
public class LogicTest {
    
    public LogicTest() {
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
    public void tearDown(){
    }

    /**
     * Test of main method, of class Calcula2.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(5, 5, 1, 10);
        Logic instance = new Logic();
        float expResult = 10.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
    }
    
}
