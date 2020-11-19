package edu.juniv.cse;
import java.util.Scanner;
public class coffeeLoop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        boolean stop = false;
        while (!stop) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            System.out.println();
            switch (action) {
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(disposableCups + " of disposable cups");
                    if (money == 0) {
                        System.out.println( money + " of money");
                    }
                    else {
                        System.out.println("$" + money + " of money");
                    }
                    System.out.println();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")) {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        }
                        else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        else if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        else {
                            water -= 250;
                            coffeeBeans -= 16;
                            disposableCups -= 1;
                            money += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (choice.equals("2")) {
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                        }
                        else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        }
                        else if (coffeeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        else if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        else {
                            water -= 350;
                            milk -= 75;
                            coffeeBeans -= 20;
                            disposableCups -= 1;
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (choice.equals("3")) {
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                        }
                        else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        }
                        else if (coffeeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        else if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        else {
                            water -= 200;
                            milk -= 100;
                            coffeeBeans -= 12;
                            disposableCups -= 1;
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (choice.equals("back")) {
                        break;
                    }
                    System.out.println();
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addCoffee = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addCups = scanner.nextInt();
                    water += addWater;
                    milk += addMilk;
                    coffeeBeans += addCoffee;
                    disposableCups += addCups;
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println();
                    break;
                case "exit":
                    stop = true;
                    break;
                default:
                    break;
            }
        }
    }
}
