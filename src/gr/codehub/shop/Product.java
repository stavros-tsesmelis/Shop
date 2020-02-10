package gr.codehub.shop;

import java.util.Scanner;

public class Product {
    public static void ProductInfos(){
        double price = .52;
        String brand = "Lux";
        int quantity = 10;

        System.out.println("Our shop offers " + quantity  + " \"" + brand + "\"" + " orange juices.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Want to buy a juice? [Y/N]");
        while (quantity > 0 && sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {
            quantity -= 1;
            System.out.println("Cheers! \nThere are " + quantity + " juices left.\n");
            System.out.println("Want another one? [Y/N]\n");
            if (quantity == 0) {
                System.out.println("You drink them all! \nCome back tomorrow for more.");
            }
        }
    }
}
