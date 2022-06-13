package com.cydeo.tests.day5;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @BeforeClass
    public void init(){
        System.out.println("run once before all tests");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("run once before each test");
    }
    @Test
    public void testOnePlus() {     //1+5=6
        assertEquals(1 + 5, 6);//Assert.assertEquals(1+5,6); yerine assertEquals(1+5,6);
        //yazdiktan sonra yazi kirmizi olacaktir.Yazinin ustune gelip alt enter yaptiginda import
        //dediginde import static org.testng.Assert.assertEquals; import edilecektir ve her seferinde
        //tekrar Assert.assertEquals(1+5,6) yazmana gerek kalmayacak assertEquals(1+5,6); yazman
        // yeterli olacaktir
        System.out.println("test1 is running");
    }
        @Test
        public void testTenMinus4(){
          assertEquals(10-4,6);
            System.out.println("test2 is running");
        }
        @AfterMethod
        public void teardown(){
            System.out.println("Run oce after each test");
        }
        @AfterClass
        public void cleanUp(){
            System.out.println("run once after all test");
        }

    }

