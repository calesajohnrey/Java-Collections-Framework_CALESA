package oop_calesa;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static ArrayList<Integer> numbers;
    public static void main(String[] args) {
        try {
            System.out.println("Please enter the size of the array: ");
            Scanner number = new Scanner(System.in); 
            String numberArrStr = number.next();
            Integer nums = Integer.parseInt(numberArrStr);
            numbers = new ArrayList<>(nums);
            Scanner prompt = new Scanner(System.in);
            System.out.print("Enter the new item here: ");
            String newInputItem = prompt.next(); 
            Integer newObject = Integer.parseInt(newInputItem);
            numbers.add(newObject);
            System.out.println(" ");
            System.out.println("You set the number of items in the Array!");
            System.out.println(" ");
            System.out.println(numbers);  
        } catch (Exception e) {
            System.out.print("Error!");
        }
    }
}