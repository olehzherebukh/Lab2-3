package ua.lviv.iot.pharmacy.managers;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.pharmacy.goods.GoodsOfPharmacy;
import ua.lviv.iot.pharmacy.goods.Quality;
import ua.lviv.iot.pharmacy.goods.TypeOfGood;


class PharmacyManagerTest {

private List<GoodsOfPharmacy> list;
    
    private PharmacyManager pharmacyManager;
    
    @BeforeEach
    public void setUp() {

        pharmacyManager = new PharmacyManager();
        pharmacyManager.addGood(new GoodsOfPharmacy(130.0, "NaN",
                Quality.GOOD, 40, TypeOfGood.NUTRITION));
        pharmacyManager.addGood(new GoodsOfPharmacy(800.0, "Agusha",
                Quality.PERFECT, 25, TypeOfGood.NUTRITION));
        pharmacyManager.addGood(new GoodsOfPharmacy(230.0, "Baby",
                Quality.BAD, 43, TypeOfGood.MEDICINE));
        pharmacyManager.addGood(new GoodsOfPharmacy(30.0, "Colin",
                Quality.GOOD, 73, TypeOfGood.NUTRITION));
        pharmacyManager.addGood(new GoodsOfPharmacy(250.0, "Allas",
                Quality.BAD, 83, TypeOfGood.VITAMINS));
    }
    
    
    @Test
    void testFindGoodsbyPrice() {
        Assertions.assertEquals(0,  pharmacyManager.findByPrice(1.0).size());
        Assertions.assertEquals(0,  pharmacyManager.findByPrice(2.0).size());
        Assertions.assertEquals(0,  pharmacyManager.findByPrice(3.0).size());
        Assertions.assertEquals(0,  pharmacyManager.findByPrice(4.0).size());
     }

    @Test
    void testSortByAmountOfCustomersDayByDecrease() {
      
        List<GoodsOfPharmacy> newList = new ArrayList<GoodsOfPharmacy>(); 
        newList = pharmacyManager.sortByAmountOfCustomersDayByDecrease();
        
        Assertions.assertEquals(83,
                (newList.get(0)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(73,
                (newList.get(1)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(43,
                (newList.get(2)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(40,
                (newList.get(3)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(25,
                (newList.get(4)).getAmountOfCustomersPerDay());
     }
    
    @Test
    void testSortByAmountOfCustomersDayByIncrease() {
      
        List<GoodsOfPharmacy> newList = new ArrayList<GoodsOfPharmacy>(); 
        newList = pharmacyManager.sortByAmountOfCustomersDayByIncrease();
        
        Assertions.assertEquals(25,
                (newList.get(0)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(40,
                (newList.get(1)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(43,
                (newList.get(2)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(73,
                (newList.get(3)).getAmountOfCustomersPerDay());
        Assertions.assertEquals(83,
                (newList.get(4)).getAmountOfCustomersPerDay());
     }
    
    @Test
    void testsortByNameOfGoodByIncrease() {
      
        List<GoodsOfPharmacy> newList = new ArrayList<GoodsOfPharmacy>(); 
        newList = pharmacyManager.sortByNameOfGoodByIncrease();
        
        Assertions.assertEquals("Agusha", (newList.get(0)).getNameOfGood());
        Assertions.assertEquals("Allas", (newList.get(1)).getNameOfGood());
        Assertions.assertEquals("Baby", (newList.get(2)).getNameOfGood());
        Assertions.assertEquals("Colin", (newList.get(3)).getNameOfGood());
        Assertions.assertEquals("NaN", (newList.get(4)).getNameOfGood());
     }
    
    @Test
    void testsortByNameOfGoodByDecrease() {
      
        List<GoodsOfPharmacy> newList = new ArrayList<GoodsOfPharmacy>(); 
        newList = pharmacyManager.sortByNameOfGoodByDecrease();
        
        Assertions.assertEquals("NaN", (newList.get(0)).getNameOfGood());
        Assertions.assertEquals("Colin", (newList.get(1)).getNameOfGood());
        Assertions.assertEquals("Baby", (newList.get(2)).getNameOfGood());
        Assertions.assertEquals("Allas", (newList.get(3)).getNameOfGood());
        Assertions.assertEquals("Agusha", (newList.get(4)).getNameOfGood());
     }
}
