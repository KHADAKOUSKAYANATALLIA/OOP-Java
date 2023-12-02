package HomeWork01;

/*
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
заложенную в программе.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
//        productList.add(new BottleOfWater("qwe", 123, 100));
//        productList.add(new BottleOfWater("qwe", 200, 150));
//        productList.add(new BottleOfWater("zxcg", 500, 1000));
//        productList.add(new BottleOfWater("qaffwe", 123, 10));
//        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
//        vendingMachine.initProduct(productList);
//        System.out.println(vendingMachine.getProduct("qwe", 150));
//        Product test = new BottleOfWater("asd", 123, 123);

        productList.add(new HotDrink("Coffee", 70, 250, 100));
        productList.add(new HotDrink("Tea", 25, 350, 80));
        productList.add(new HotDrink("Cocao", 30, 200, 70));
        productList.add(new HotDrink("Chocolate", 50, 150, 90));
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        hotDrinksVendingMachine.initProduct(productList);
        System.out.println(hotDrinksVendingMachine.getProduct("Cocao", 200, 70));
    }
}

