package ua.lviv.iot.pharmacy.managers;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.pharmacy.goods.GoodsOfPharmacy;
import  ua.lviv.iot.pharmacy.managers.PharmacyManager;

public class Main {

	public static void main(String[] args) {
		PharmacyManager obj1 = new PharmacyManager();
		System.out.println(obj1.add());
		System.out.println("\n");
		System.out.println(obj1.sortByAmountOfCustomersPerDayByDecrease());
		System.out.println("\n");
		System.out.println(obj1.sortByAmountOfCustomersPerDayByIncrease());
		System.out.println("\n");
		System.out.println(obj1.sortByNameOfGoodByIncrease());
		System.out.println("\n");
		System.out.println(obj1.sortByNameOfGoodByDecrease());
		}
	}

