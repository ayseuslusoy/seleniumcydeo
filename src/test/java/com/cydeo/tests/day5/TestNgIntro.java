package com.cydeo.tests.day5;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestNgIntro {
    @BeforeClass
    public void setMethod(){//IntelliJ de bu metodu nereye yazdigin onemli degildir. En sonada
        // yazabilirsin cunku annotation konsolda olmasi gerektigi gibi en basta gosterir
        System.out.println("Before Class is running");
    }
    @AfterClass
    public void tearDown(){//IntelliJ de bu metodu nereye yazdigin onemli degildir. En sonada
        // yazabilirsin cunku annotation konsolda olmasi gerektigi gibi en sonda gosterir
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setUpMethod(){//Kac tane test method varsa her test methodundan once bu methodu bir
        // kez yazmama ragmen her testden once tekrar yazilir
        System.out.println("Before method is running");
    }
    @AfterMethod//Kac tane test method varsa her test methoddan sonra bu methodun icindekiler tekrar
    public void tearDownMethod(){//yazilir
        System.out.println("After method is running");
    }
     @Test (priority=1)//intelliJ de test birden fazla ise sirayla gozukmesi icin priority=sayi
     //yazilabilir.@Test icindeki yazilarin random order ni engellemek icin priority keyword kullan
    public void test1() {//Normalde bu metot manin metotsuz calismaz ama bu metodun ustune @Test
         // tazip enter a bastiginda import yapacaktir ve metot runnable olur
         System.out.println("Test 1 is running");//Hic bir assertion henuz yapmadigimiz icin
         // assertion yapana kadar butun yaptigimiz println ler passes olarak gozukecek
         //Assert Equals:Compare 2 of the same things
         String actual = "apple";
         String expected = "apple";
         Assert.assertEquals("actual","expected");//Eger bu islem dogru ise test1
         //pass yanlis ise fail olarak guzukecek

     }
         @Test (priority=2)
         public void test2(){
             System.out.println("Test 2 is running");
             //Assert True
             String actual1="pear";
             String expected1="apricot";
             Assert.assertTrue(actual1.equals(expected1));
         }

    }

