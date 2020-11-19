package edu.juniv.cse;
import java.util.Scanner;
public class coffeeMachine {
    public static void main (String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        int waterFor1Cup = 200;
        int milkFor1Cup = 50;
        int coffeeFor1Cup = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * waterFor1Cup + " ml of water");
        System.out.println(cups * milkFor1Cup + " ml of milk");
        System.out.println(cups * coffeeFor1Cup + " g of coffee beans");


    }

}
