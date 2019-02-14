package ua.lviv.iot.pharmacy.managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ua.lviv.iot.pharmacy.goods.GoodsOfPharmacy;

import ua.lviv.iot.pharmacy.goods.Quality;

import ua.lviv.iot.pharmacy.goods.TypeOfGood;

public class PharmacyManager {
	
	List<GoodsOfPharmacy> list = new ArrayList<GoodsOfPharmacy>();
	
	public List<GoodsOfPharmacy> add() {
	list.add(new GoodsOfPharmacy(120.0, "NaN", Quality.GOOD, 23, TypeOfGood.NUTRITION ));
	list.add(new GoodsOfPharmacy(80.49, "Pektolvan", Quality.BAD, 33, TypeOfGood.MEDICINE));
	list.add(new GoodsOfPharmacy(127.40, "Agusha", Quality.PERFECT, 63, TypeOfGood.NUTRITION));
	list.add(new GoodsOfPharmacy(130.80, "Pingvin", Quality.GOOD, 35, TypeOfGood.VITAMINS));
	list.add(new GoodsOfPharmacy(20.99, "Spray", Quality.BAD, 23, TypeOfGood.MEDICINE));
	list.add(new GoodsOfPharmacy(150.90, "Vaselin", Quality.GOOD, 63, TypeOfGood.MEDICINE));
	list.add(new GoodsOfPharmacy(420.80, "Konan", Quality.PERFECT, 7, TypeOfGood.VITAMINS));
	list.add(new GoodsOfPharmacy(160.30, "Meril", Quality.BAD, 34, TypeOfGood.VITAMINS));
	list.add(new GoodsOfPharmacy(160.90, "Colin", Quality.GOOD, 67, TypeOfGood.NUTRITION));
	
	//System.out.print("Input a type: ");
	//Scanner ih = new Scanner(System.in);
	//String type = ih.nextLine();
	
	//System.out.print("Input a price: ");
	//Scanner in = new Scanner(System.in);
	//double price = in.nextDouble();
	 
	 List<GoodsOfPharmacy> boofer = new ArrayList<GoodsOfPharmacy>();
	 
	for (GoodsOfPharmacy temp : list) {
	if ( temp.getTypeOfGood() == TypeOfGood.NUTRITION && temp.getPriceOfGood() < 150.0) {
		boofer.add(temp);
		}
	}
	
	for (GoodsOfPharmacy temp1 : boofer) {
		System.out.println(temp1);
	}
	
	return boofer;
	}
	
	public List<GoodsOfPharmacy> sortByAmountOfCustomersPerDayByDecrease() {
		List<GoodsOfPharmacy> result = new ArrayList<GoodsOfPharmacy>();

		result.add(new GoodsOfPharmacy(120.0, "NaN", Quality.GOOD, 23, TypeOfGood.NUTRITION ));
		result.add(new GoodsOfPharmacy(80.49, "Pektolvan", Quality.BAD, 33, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(127.40, "Agusha", Quality.PERFECT, 63, TypeOfGood.NUTRITION));
		result.add(new GoodsOfPharmacy(130.80, "Pingvin", Quality.GOOD, 35, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(20.99, "Spray", Quality.BAD, 23, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(150.90, "Vaselin", Quality.GOOD, 63, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(420.80, "Konan", Quality.PERFECT, 7, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.30, "Meril", Quality.BAD, 34, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.90, "Colin", Quality.GOOD, 67, TypeOfGood.NUTRITION));
		
		
		result.sort(new Comparator<GoodsOfPharmacy>() {
		@Override
		public int compare(GoodsOfPharmacy o1, GoodsOfPharmacy o2) {
			return o2.getAmountOfCustomersPerDay() - o1.getAmountOfCustomersPerDay();
		}
	});	
	
		result.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)->o2.getAmountOfCustomersPerDay()-o1.getAmountOfCustomersPerDay());

		result.forEach((customer)->System.out.println(customer));
		return result;
  }
	
	public List<GoodsOfPharmacy> sortByAmountOfCustomersPerDayByIncrease() {
		List<GoodsOfPharmacy> result = new ArrayList<GoodsOfPharmacy>();

		result.add(new GoodsOfPharmacy(120.0, "NaN", Quality.GOOD, 23, TypeOfGood.NUTRITION ));
		result.add(new GoodsOfPharmacy(80.49, "Pektolvan", Quality.BAD, 33, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(127.40, "Agusha", Quality.PERFECT, 63, TypeOfGood.NUTRITION));
		result.add(new GoodsOfPharmacy(130.80, "Pingvin", Quality.GOOD, 35, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(20.99, "Spray", Quality.BAD, 23, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(150.90, "Vaselin", Quality.GOOD, 63, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(420.80, "Konan", Quality.PERFECT, 7, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.30, "Meril", Quality.BAD, 34, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.90, "Colin", Quality.GOOD, 67, TypeOfGood.NUTRITION));
		
		
		result.sort(new Comparator<GoodsOfPharmacy>() {
		@Override
		public int compare(GoodsOfPharmacy o1, GoodsOfPharmacy o2) {
			return o2.getAmountOfCustomersPerDay() - o1.getAmountOfCustomersPerDay();
		}
	});	
	
		result.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)->o1.getAmountOfCustomersPerDay()-o2.getAmountOfCustomersPerDay());

		result.forEach((customer)->System.out.println(customer));
		return result;
  }
	
	public List<GoodsOfPharmacy> sortByNameOfGoodByIncrease() {
		List<GoodsOfPharmacy> result = new ArrayList<GoodsOfPharmacy>();

		result.add(new GoodsOfPharmacy(120.0, "NaN", Quality.GOOD, 23, TypeOfGood.NUTRITION ));
		result.add(new GoodsOfPharmacy(80.49, "Pektolvan", Quality.BAD, 33, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(127.40, "Agusha", Quality.PERFECT, 63, TypeOfGood.NUTRITION));
		result.add(new GoodsOfPharmacy(130.80, "Pingvin", Quality.GOOD, 35, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(20.99, "Spray", Quality.BAD, 23, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(150.90, "Vaselin", Quality.GOOD, 63, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(420.80, "Konan", Quality.PERFECT, 7, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.30, "Meril", Quality.BAD, 34, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.90, "Colin", Quality.GOOD, 67, TypeOfGood.NUTRITION));
		
		
		Collections.sort(result, new Comparator<GoodsOfPharmacy>() {
		@Override
		public int compare(GoodsOfPharmacy o1, GoodsOfPharmacy o2) {
			return o1.getNameOfGood().compareTo(o2.getNameOfGood());
		}
	});	
	
		result.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)->o1.getNameOfGood().compareTo(o2.getNameOfGood()));
		result.sort((o1, o2)->o1.getNameOfGood().compareTo(o2.getNameOfGood()));
		for (GoodsOfPharmacy temp1 : result) {
			System.out.println(temp1);
		}
		return result;
  }
	
	public List<GoodsOfPharmacy> sortByNameOfGoodByDecrease() {
		List<GoodsOfPharmacy> result = new ArrayList<GoodsOfPharmacy>();

		result.add(new GoodsOfPharmacy(120.0, "NaN", Quality.GOOD, 23, TypeOfGood.NUTRITION ));
		result.add(new GoodsOfPharmacy(80.49, "Pektolvan", Quality.BAD, 33, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(127.40, "Agusha", Quality.PERFECT, 63, TypeOfGood.NUTRITION));
		result.add(new GoodsOfPharmacy(130.80, "Pingvin", Quality.GOOD, 35, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(20.99, "Spray", Quality.BAD, 23, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(150.90, "Vaselin", Quality.GOOD, 63, TypeOfGood.MEDICINE));
		result.add(new GoodsOfPharmacy(420.80, "Konan", Quality.PERFECT, 7, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.30, "Meril", Quality.BAD, 34, TypeOfGood.VITAMINS));
		result.add(new GoodsOfPharmacy(160.90, "Colin", Quality.GOOD, 67, TypeOfGood.NUTRITION));
		
		
		Collections.sort(result, new Comparator<GoodsOfPharmacy>() {
		@Override
		public int compare(GoodsOfPharmacy o1, GoodsOfPharmacy o2) {
			return o1.getNameOfGood().compareTo(o2.getNameOfGood());
		}
	});	
	
		result.sort((GoodsOfPharmacy o1, GoodsOfPharmacy o2)->o1.getNameOfGood().compareTo(o2.getNameOfGood()));
		result.sort((o1, o2)->o2.getNameOfGood().compareTo(o1.getNameOfGood()));
		for (GoodsOfPharmacy temp1 : result) {
			System.out.println(temp1);
		}
		return result;
  }
}
