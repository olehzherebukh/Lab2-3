package src.main.java.ua.lviv.iot.pharmacy.managers;

public class Main {

    public static void main(final String[] args) {
        PharmacyManager obj1 = new PharmacyManager();
        System.out.println(obj1.findByPrice());
        System.out.println("\n");
        System.out.println(obj1.sortByAmountOfCustomersDayByDecrease());
        System.out.println("\n");
        System.out.println(obj1.sortByAmountOfCustomersDayByIncrease());
        System.out.println("\n");
        System.out.println(obj1.sortByNameOfGoodByIncrease());
        System.out.println("\n");
        System.out.println(obj1.sortByNameOfGoodByDecrease());
       }
    }

