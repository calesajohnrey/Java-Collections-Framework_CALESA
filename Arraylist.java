//This is program only accepts numbers.
//Please be warned!
// by: John Rey Calesa 😘

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static ArrayList<String> fruits;

    static void addElement() {
        System.out.println("");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This is the interface for adding an element!");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the new item here: ");
        String newInputItem = prompt.next();
        if (newInputItem instanceof String) {
            String stringed = newInputItem;
            double newObject = Double.parseDouble(stringed);
            if (newObject > 0.0) {
                fruits.add(newInputItem);
                System.out.println(" ");
                System.out.println("Added new item in the Array!");
                System.out.println(" ");
                prompt();
            } else {
                System.out.print("");
                System.out.print("Too low");
                System.out.print("");
                addElement();
            }
        } else {
            System.out.print("Invalid Input");
            addElement();
        }
    }

    static void removeElement() {
        System.out.println("");
        System.out.println("This is the interface for removing an element!");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(fruits);
        System.out.println(" --------------------------------------------- ");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the item here: ");
        Object newInputItem = prompt.nextLine();
        if (newInputItem instanceof String) {
            System.out.println("Invalid input");
        } else {
            if ("".equals(newInputItem)) {
                System.out.println("");
                System.out.println("No value entered!");
                System.out.println("Try again");
                removeElement();
            } else {
                String newItem = newInputItem.toString();
                String newItems = newItem.toLowerCase();
                if (fruits.contains(newItems)) {
                    fruits.remove(String.valueOf(newItem));
                    System.out.println(fruits);
                    prompt();
                } else {
                    System.out.println("The input element is not in array");
                    System.out.println("Try again");
                    removeElement();
                }
            }
        }
    }

    static void displayElement() {
        System.out.println("");
        System.out.println("This is the interface for viewing all element!");
        System.out.println("+---------------------------------------------+");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(fruits);
        System.out.println("");
        prompt();
    }

    static void clearArray() {
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("+---------------------------------------------+");
        System.out.println(" ");
        System.out.println("Do you want to clear the elements in array: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println("Invalid input.");
            clearArray();
        } else {
            switch (answer) {
                case "y":
                    System.out.println(" ");
                    System.out.println("Exiting the program!");
                    fruits.clear();
                    System.out.println(fruits);
                    intro();
                    break;
                case "n":
                    prompt();
                    break;
                default:
                    System.out.println("Invalid input.");
                    clearArray();
                    break;
            }
        }
    }

    static void intro() {
        System.out.println(" ");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(fruits);
        System.out.println(" --------------------------------------------- ");
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please select your option:");
        System.out.println("A. Add an element in the array.");
        System.out.println("B. Remove an element in the array.");
        System.out.println("C. Display all elements in the array.");
        System.out.println("D. Clear elements in the array");
        System.out.println("E. Exit the program!");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = input.nextLine();
        String convertChar = inputChar.toUpperCase();
        if (convertChar instanceof String) {
            switch (convertChar) {
                case "A":
                    addElement();
                case "B":
                    removeElement();
                case "C":
                    displayElement();
                case "D":
                    clearArray();
                case "E":
                    exitElement();
                default:
                    System.out.println("Invalid input");
                    intro();
            }
        }
    }

    static void prompt() {
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Do you want to go back: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println("Invalid input.");
            System.out.println(" ");
            prompt();
        } else
            switch (answer) {
                case "y":
                    System.out.println(" ");
                    intro();
                case "n":
                    System.out.println(" ");
                    exitElement();
                default:
                    System.out.println("Invalid input.");
                    System.out.println(" ");
                    prompt();
            }

    }

    static void exitElement() {
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Do you want to exit: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if ("y".equals(answer)) {
            System.out.println("Exiting the program!");
            System.exit(0);
        } else if ("n".equals(answer)) {
            System.out.println(" ");
            prompt();
        } else {
            System.out.println(" ");
            System.out.println("Invalid input.");
            System.out.println(" ");
            exitElement();
        }

    }

    public static void main(String[] args) {
        fruits = new ArrayList();
        intro();
    }
}
