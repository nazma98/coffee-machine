package edu.juniv.cse;
import java.util.Scanner;
public class realCoffeeMachine {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 250 + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans - 16 + " of coffee beans");
                    System.out.println(disposableCups - 1 + " of disposable cups");
                    System.out.println(money + 4 + " of money");
                    break;
                case 2:
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 350 + " of water");
                    System.out.println(milk - 75 + " of milk");
                    System.out.println(coffeeBeans - 20 + " of coffee beans");
                    System.out.println(disposableCups - 1 + " of disposable cups");
                    System.out.println(money + 7 + " of money");
                    break;
                case 3:
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 200 + " of water");
                    System.out.println(milk - 100 + " of milk");
                    System.out.println(coffeeBeans - 12 + " of coffee beans");
                    System.out.println(disposableCups - 1  + " of disposable cups");
                    System.out.println(money + 6 + " of money");
                    break;
                default:
                    break;
            }
        }
        if (action.equals("fill")) {
            System.out.println("Write how many ml of water do you want to add:");
            int addWater = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int addMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            int addCoffee = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int addCups = scanner.nextInt();

            System.out.println("The coffee machine has:");
            System.out.println(water + addWater + " of water");
            System.out.println(milk + addMilk + " of milk");
            System.out.println(coffeeBeans + addCoffee + " of coffee beans");
            System.out.println(disposableCups + addCups + " of disposable cups");
            System.out.println(money + " of money");

        }
        if (action.equals("take")) {
            System.out.println("I gave you $" + money);

            System.out.println("The coffee machine has:");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(coffeeBeans + " of coffee beans");
            System.out.println(disposableCups + " of disposable cups");
            System.out.println(0 + " of money");
        }
    }
}
