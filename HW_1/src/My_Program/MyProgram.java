package My_Program;

import java.util.ArrayList;
import java.util.List;

public class MyProgram {

    public static void main(String[] args) {

//        Product product1 = new Product();
////        product1.name = "product1";
////        product1.brand = "brand1";
////        product1.price = 200;
//        System.out.println(product1.displayInfo());
//
//        Product product2 = new Product(null, "brand2", 300);
//        System.out.println(product2.displayInfo());
//        product2.setPrice(400);
//        double price = product2.getPrice();
//        System.out.println(price);
//        System.out.println(product2.displayInfo());
//
//        Product product3 = new Product("product3");
////        product3.price = -100;
////        product3.name = "A";
//        System.out.println(product3.displayInfo());

        Product choc1 = new Chocolate(
                "Аленка",
                "Красный октябрь",
                150,
                75,
                "Молочный");

        Product choc2 = new Chocolate(
                "Вдохновение",
                "РотФронт",
                120,
                80,
                "Горький");

        Product chip1 = new PotatoChips(
                "Русская картошка",
                "РусКарт",
                110,
                200,
                "Бекон");

        Product chip2 = new PotatoChips(
                "Lays",
                "FritoLay",
                200,
                250,
                "Сыр");

        List<Product> products = new ArrayList<>();
        products.add(choc1);
        products.add(choc2);
        products.add(chip1);
        products.add(chip2);

        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolate = vendingMachine.getChocolate("Аленка","Молочный");
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
            System.out.println("____________________________");
        } else {
            System.out.println("Такого шоколада нет");
        }
        PotatoChips potatoChips = vendingMachine.getPotatoChips("Русская картошка","Бекон");
        if (potatoChips != null) {
            System.out.println("Вы получили: ");
            System.out.println(potatoChips.displayInfo());
        } else {
            System.out.println("Таких чипсов нет");
        }

    }
}
