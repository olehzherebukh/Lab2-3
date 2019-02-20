package src.main.java.ua.lviv.iot.pharmacy.managers;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import src.main.java.ua.lviv.iot.pharmacy.goods.GoodsOfPharmacy;

import src.main.java.ua.lviv.iot.pharmacy.goods.Quality;

import src.main.java.ua.lviv.iot.pharmacy.goods.TypeOfGood;

public class PharmacyManager {

    private List<GoodsOfPharmacy> list = new ArrayList<GoodsOfPharmacy>();

    public List<GoodsOfPharmacy> add() {
    list.add(new GoodsOfPharmacy(120.0, "NaN",
            Quality.GOOD, 23, TypeOfGood.NUTRITION));
    list.add(new GoodsOfPharmacy(80.49, "Pektolvan",
            Quality.BAD, 33, TypeOfGood.MEDICINE));
    list.add(new GoodsOfPharmacy(127.40, "Agusha",
            Quality.PERFECT, 63, TypeOfGood.NUTRITION));
    list.add(new GoodsOfPharmacy(130.80, "Pingvin",
            Quality.GOOD, 35, TypeOfGood.VITAMINS));
    list.add(new GoodsOfPharmacy(20.99, "Spray",
            Quality.BAD, 23, TypeOfGood.MEDICINE));
    list.add(new GoodsOfPharmacy(150.90, "Vaselin",
            Quality.GOOD, 63, TypeOfGood.MEDICINE));
    list.add(new GoodsOfPharmacy(420.80, "Konan",
            Quality.PERFECT, 7, TypeOfGood.VITAMINS));
    list.add(new GoodsOfPharmacy(160.30, "Meril",
            Quality.BAD, 34, TypeOfGood.VITAMINS));
    list.add(new GoodsOfPharmacy(160.90, "Colin",
            Quality.GOOD, 67, TypeOfGood.NUTRITION));

    return list;
    }
    
    
    public List<GoodsOfPharmacy> findByPrice() {
        add();
     final List<GoodsOfPharmacy> boofer = new ArrayList<GoodsOfPharmacy>();

    for (final GoodsOfPharmacy temp : list) {
        if (temp.getTypeOfGood() == TypeOfGood.NUTRITION
                && temp.getPriceOfGood() < 150.0) {
        boofer.add(temp);
        }
    }

    for (final GoodsOfPharmacy temp1 : boofer) {
        System.out.println(temp1);
    }

    return boofer;
    }


    public List<GoodsOfPharmacy> sortByAmountOfCustomersDayByDecrease() {

        list.sort(new Comparator<GoodsOfPharmacy>() {
        @Override
        public int compare(final GoodsOfPharmacy obj1,
                final GoodsOfPharmacy obj2) {
            return obj2.getAmountOfCustomersPerDay()
                       - obj1.getAmountOfCustomersPerDay();
        }
        });

        list.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)
                -> o2.getAmountOfCustomersPerDay()
                - o1.getAmountOfCustomersPerDay());

        list.forEach((customer) -> System.out.println(customer));
        return list;
  }

    public List<GoodsOfPharmacy> sortByAmountOfCustomersDayByIncrease() {

        list.sort(new Comparator<GoodsOfPharmacy>() {
        @Override
        public int compare(final GoodsOfPharmacy obj1,
                final GoodsOfPharmacy obj2) {
            return obj2.getAmountOfCustomersPerDay()
                    - obj1.getAmountOfCustomersPerDay();
        }
        });

        list.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)
                -> o1.getAmountOfCustomersPerDay()
                - o2.getAmountOfCustomersPerDay());

        list.forEach((customer) -> System.out.println(customer));
        return list;
  }

    public List<GoodsOfPharmacy> sortByNameOfGoodByIncrease() {

        Collections.sort(list, new Comparator<GoodsOfPharmacy>() {
        @Override
        public int compare(final GoodsOfPharmacy obj1,
                final GoodsOfPharmacy obj2) {
            return obj1.getNameOfGood().compareTo(obj2.getNameOfGood());
        }
      });

        list.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)
                -> o1.getNameOfGood().compareTo(o2.getNameOfGood()));
        list.sort((o1, o2)
                -> o1.getNameOfGood().compareTo(o2.getNameOfGood()));
        for (final GoodsOfPharmacy temp1 : list) {
            System.out.println(temp1);
        }
        return list;
  }

    public List<GoodsOfPharmacy> sortByNameOfGoodByDecrease() {
        
        Collections.sort(list, new Comparator<GoodsOfPharmacy>() {
        @Override
        public int compare(final GoodsOfPharmacy obj1,
                final GoodsOfPharmacy obj2) {
            return obj1.getNameOfGood().compareTo(obj2.getNameOfGood());
        }
        });

        list.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)
                -> o1.getNameOfGood().compareTo(o2.getNameOfGood()));
        list.sort((o1, o2)
                -> o2.getNameOfGood().compareTo(o1.getNameOfGood()));
        for (final GoodsOfPharmacy temp1 : list) {
            System.out.println(temp1);
        }
        return list;
   }
 }


