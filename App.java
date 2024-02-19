package com.cc.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main (String[] args) throws IOException {
        String food = "";
        String drink = "";
        String side = "";
        double totalCost = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Guten Tag bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger (1), Cheeseburger (2) oder Chilliburger (3) ?");
        int burgerSelection = Integer.parseInt(reader.readLine());
        switch (burgerSelection) {
            case 1:
                food = "Hamburger";
                totalCost += 3.5;
                break;
            case 2:
                food = "Cheeseburger";
                totalCost += 4.0;
                break;
            case 3:
                food = "Chilliburger";
                totalCost += 4.5;
                break;
        }
        
        System.out.println("Möchten Sie eine Beilage dazu bestellen? (Pommes (1) oder Onion Rings (2))");
        String orderSide = reader.readLine();
        if (orderSide.equalsIgnoreCase("1")) {
            side = "Pommes";
            totalCost += 2.0;
        } else if (orderSide.equalsIgnoreCase("2")) {
            side = "Onion Rings";
            totalCost += 2.5;
        }
        
        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
        String orderDrink = reader.readLine();
        if (orderDrink.equalsIgnoreCase("j")) {
            System.out.println("Cola (1), Fanta (2), Sprite (3) ?");
            int drinkSelection = Integer.parseInt(reader.readLine());
            switch (drinkSelection) {
                case 1:
                    drink = "Cola";
                    totalCost += 1.5;
                    break;
                case 2:
                    drink = "Fanta";
                    totalCost += 1.5;
                    break;
                case 3:
                    drink = "Sprite";
                    totalCost += 1.5;
                    break;
            }
            
            System.out.println("Möchten Sie Eis zum Getränk hinzufügen? (j/n)");
            String orderIce = reader.readLine();
            if (orderIce.equalsIgnoreCase("j")) {
                totalCost += 1.0;
            }
        }
        
        System.out.println("Möchten Sie einen Coupon anwenden, um einen Rabatt zu erhalten? (j/n)");
        String applyCoupon = reader.readLine();
        if (applyCoupon.equalsIgnoreCase("j")) {
            totalCost *= 0.9; // 10% Rabatt
        }
        
        System.out.println("Hier ist Ihre Bestellung: " + food + ", " + side + " und " + drink);
        System.out.println("Gesamtkosten: $" + totalCost);
        System.out.println("Vielen Dank, und Auf Wiedersehen!");
    }
}
