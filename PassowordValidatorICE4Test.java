/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package passowordvalidatorice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asma
 */
public class PassowordValidatorICE4Test {
    
    public PassowordValidatorICE4Test() {
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
     * Test of main method, of class PasswordValidatorICE4.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidatorICE4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     * Test of checkLenght method, of class PasswordValidatorICE4.
     */
    @Test
    public void testCheckLenghtGood() 
    {
        System.out.println("CheckLenght good");
        String pass = "sheridan";
        boolean expResult = true;
        boolean result = PassowordValidatorICE4.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testCheckLenghtBad() 
    {
        System.out.println("CheckLenght bad");
        String pass = "sherida";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testCheckLenghtBoundry() 
    {
        System.out.println("CheckLenght boundry");
        String pass = "";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testCheckUpperGood() 
    {
        System.out.println("CheckUpper good");
        String pass = "Sheridan";
        boolean expResult = true;
        boolean result = PassowordValidatorICE4.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
     public void testCheckUpperBad() 
    {
        System.out.println("CheckUpper bad");
        String pass = "sheridan";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
        public void testCheckUpperBoundry() 
    {
        System.out.println("CheckUpper boundry");
        String pass = "";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }@Test
        public void testCheckSpecialGood() 
    {
        System.out.println("CheckSpecial good");
        String pass = "Sheridan&";
        boolean expResult = true;
        boolean result = PassowordValidatorICE4.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        @Test
       public void testCheckSpecialBad() 
    {
        System.out.println("CheckSpecial bad");
        String pass = "Sheridan";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
        public void testCheckSpecialBoundry() 
    {
        System.out.println("CheckSpecial boundry");
        String pass = "";
        boolean expResult = false;
        boolean result = PassowordValidatorICE4.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}