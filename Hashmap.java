import java.util.HashMap;
import java.util.Scanner;

public class Hashmap { 
public static HashMap<String, Integer> foods;

    
static void addElement(){
        String food1;
        int food2;
        boolean idtfr = false;
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This is the interface for adding an element!");
        System.out.print("Enter the item one here: ");
        food1 = input.next();
        System.out.print("Enter the new item here: ");
        food2 = input.nextInt();
        for (int i = 2; i <= food2/2; ++i) {
            if (food2 % i == 0) {
            idtfr = true;
            break;
        }
    }
        if (!idtfr){
            System.out.println("");
            System.out.println(food2 + " is a prime number.");
            System.out.println("Enter another number.");
            addElement();
        } else {
            foods.put(food1,food2);
            System.out.println(" ");
            System.out.println(foods);
            System.out.println(" ");
            prompt();
        }
    }

static void removeElement(){
        System.out.println("");
        System.out.println("This is the interface for removing an element!");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the HashMap: ");
        System.out.println(foods);
        System.out.println(" --------------------------------------------- ");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the item here: ");
        Object newInputItem = prompt.nextLine();
        if (newInputItem instanceof Integer){
            System.out.println("Invalid input");
        } else {
            if ("".equals(newInputItem)){
            System.out.println("No value entered!");
            System.out.println("Try again");
            removeElement(); 
            }
            else {
                String newItem = newInputItem.toString();
                String newItems = newItem.toLowerCase();
                if (foods.containsKey(newItems)){
                    foods.remove(String.valueOf(newItem));
                    System.out.println(foods);
                    prompt();
                } else {
                    System.out.println("The input element is not in HashMap");
                    System.out.println("Try again");
                    removeElement();
                }
            }
        }
    } 

static void displayElement(){
            System.out.println("");
            System.out.println("This is the interface for viewing all element!");
            System.out.println("+---------------------------------------------+");
            System.out.println("This are the elements in the HashMap: ");
            System.out.println(foods);
            System.out.println("");
            prompt();
        }

static void clearArray(){
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("+---------------------------------------------+");
        System.out.println(" ");
        System.out.println("Do you want to clear the elements in HashMap: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println("Invalid input.");
            clearArray();
        } else switch (answer) {
            case "y":
                System.out.println(" ");
                System.out.println("Exiting the program!");
                foods.clear();
                System.out.println(foods);
                intro();
            
            case "n":
                prompt();
            default:
                System.out.println("Invalid input.");
                clearArray();
        }
    }

static void intro(){
    System.out.println(" ");
    System.out.println(" --------------------------------------------- ");
    System.out.println("This are the elements in the HashMap: ");
    System.out.println(foods);
    System.out.println(" --------------------------------------------- ");
    Scanner input = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Please select your option:");
    System.out.println("A. Add an element in the HashMap.");
    System.out.println("B. Remove an element in the HashMap.");
    System.out.println("C. Display all elements in the HashMap.");
    System.out.println("D. Clear elements in the HashMap.");
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

static void prompt(){
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Do you want to go back: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if ("y".equals(answer)){
            System.out.println(" ");
                intro();
        }
        else if ("n".equals(answer)){
            System.out.println(" ");
            exitElement();
        }
        else {
            System.out.println("Invalid input.");
            System.out.println(" ");
            prompt();
        }
        
    } 
    
static void exitElement(){
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Do you want to exit: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println(" ");
            System.out.println("Invalid input.");
            System.out.println(" ");
            exitElement();
        } else switch (answer) {
            case "y":
                System.out.println("Exiting the program!");
                System.exit(0);
            case "n":
                System.out.println(" ");
                prompt();
                break;
            default:
                System.out.println(" ");
                System.out.println("Invalid input.");
                System.out.println(" ");
                exitElement();
                break;
        } 
    }

public static void main(String[] args) {
    foods = new HashMap<String, Integer>();
    intro();
  }
}

