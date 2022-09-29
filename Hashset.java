import java.util.HashSet;
import java.util.Scanner;

public class Hashset { 
public static HashSet<String> vegetables; 

static void addElement(){
        System.out.println("");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This is the interface for adding an element!");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the new item here: ");
        String newInputItem = prompt.nextLine();
        if (newInputItem instanceof String){
            String stringed = newInputItem; 
                if (vegetables.contains(stringed)){
                    System.out.print("Already Present");
                    addElement();
                } else {
                    vegetables.add(stringed);
                    System.out.println(" ");
                    System.out.println(vegetables);
                    System.out.println(" ");
                    prompt();
                }
        }
    }

static void removeElement(){
        System.out.println("");
        System.out.println("This is the interface for removing an element!");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the HashSet: ");
        System.out.println(vegetables);
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
                if (vegetables.contains(newItems)){
                    vegetables.remove(String.valueOf(newItem));
                    System.out.println(vegetables);
                    prompt();
                } else {
                    System.out.println("The input element is not in HashSet");
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
        System.out.println("This are the elements in the HashSet: ");
        System.out.println(vegetables);
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
        if ("y".equals(answer)) {
            System.out.println(" ");
            System.out.println("Exiting the program!");
            vegetables.clear();
            System.out.println(vegetables);
            intro();
        } else if ("n".equals(answer)) {
            prompt();
        } else {
            System.out.println("Invalid input.");
            clearArray();
        }
    }

static void intro(){
    System.out.println(" ");
    System.out.println(" --------------------------------------------- ");
    System.out.println("This are the elements in the HashSet: ");
    System.out.println(vegetables);
    System.out.println(" --------------------------------------------- ");
    Scanner input = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Please select your option:");
    System.out.println("A. Add an element in the HashSet.");
    System.out.println("B. Remove an element in the HashSet.");
    System.out.println("C. Display all elements in the HashSet.");
    System.out.println("D. Clear elements in the HashSet");
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
    vegetables = new HashSet<String>();
    intro();
  }
}
