package edu.juniv.cse;
import java.util.Scanner;
public class coffeeMachineFinal {
    static class coffeeMachine {
        Scanner scanner = new Scanner(System.in);
        int water;
        int milk;
        int coffeeBeans;
        int disposableCups;
        int money;

        public coffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
            this.water = water;
            this.milk = milk;
            this.coffeeBeans = coffeeBeans;
            this.disposableCups = disposableCups;
            this.money = money;
        }
        public String getString() {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = scanner.nextLine();
            System.out.println();
            return action;
        }

        public void action() {
            String task = getString();
            switch (task) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
            }
        }

        public void buy() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    makeEspresso();
                    break;
                case "2":
                    makeLatte();
                    break;
                case "3":
                    makeCappuccino();
                    break;
                case "back":
                    goBack();
                    break;
                default:
                    break;
            }
            System.out.println();
        }
        public void makeEspresso() {
            if (resourceForCoffee(250, 0, 16, 1)) {
                makeCoffee(250, 0, 16, 1, 4);
            }
        }

        public void makeLatte() {
            if (resourceForCoffee(350, 75, 20, 1)) {
                makeCoffee(350, 75, 20, 1, 7);
            }
        }

        public void makeCappuccino() {
            if (resourceForCoffee(200, 100, 12, 1)) {
                makeCoffee(200, 100, 12, 1, 6);
            }
        }
        public void goBack() {
            action();
        }

        public void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int disposableCupsNeeded, int moneyEarned) {
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            disposableCups -= disposableCupsNeeded;
            money += moneyEarned;
            System.out.println("I have enough resources, making you a coffee!");
        }

        public boolean resourceForCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int disposableCupsNeeded) {
            boolean enoughResource = false;
            if (water < waterNeeded) {
                System.out.println("Sorry, not enough water!");
            }
            else if (milk < milkNeeded) {
                System.out.println("Sorry, not enough milk!");
            }
            else if (coffeeBeans < coffeeBeansNeeded) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            else if (disposableCups < disposableCupsNeeded) {
                System.out.println("Sorry, not enough disposable cups!");
            }
            else {
                enoughResource = true;
            }
            return enoughResource;
        }

        public void fill() {
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
        }

        public void remaining() {
            System.out.println("The coffee machine has:");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(coffeeBeans + " of coffee beans");
            System.out.println(disposableCups + " of disposable cups");
            System.out.println("$" + money + " of money");
            System.out.println();
        }

        public void take() {
            System.out.println("I gave you $" + money);
            money = 0;
            System.out.println();
        }
        public void exit() {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        coffeeMachine getCoffee = new coffeeMachine(400, 540, 120, 9, 550);
        for (; ;) {
            getCoffee.action();
        }
    }
}
