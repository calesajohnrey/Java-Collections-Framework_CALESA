package oop_calesa;
import java.util.ArrayList;
import java.util.Scanner;
import static oop_calesa.Person.persons;

public class main {
     public static void main(String[] args){
        persons = new ArrayList<Object>();
        try {
            System.out.println("Hi.");
            System.out.println("Please enter the size of the array: ");
            Scanner numberSize = new Scanner(System.in); 
            int nums = numberSize.nextInt();
            int i=0;
        do {
            System.out.print("Enter the name here: ");
            String newInputName= numberSize.next();
            if (newInputName instanceof java.lang.String){
                System.out.print("Enter the age here: ");
                Integer newInputAge= numberSize.nextInt();
                if (newInputAge instanceof Integer){
                    Person<String> name = new Person<>();
                    name.setName(newInputName);
                    Person<Integer> num = new Person<>();
                    num.setAge(newInputAge);
                    String nameAdd = name.getName();
                    Integer ageAdd = num.getAge();
                    if (nameAdd instanceof String && ageAdd instanceof Integer){
                        persons.add(nameAdd);
                        persons.add(String.valueOf(ageAdd));
                        i++;
                        System.out.println(persons);                   
                    }else{
                        System.out.print("Invalid Input.");
                    }
                }else {
                    System.out.print("Invalid Input.");
                }    
            }else{
               System.out.print("Invalid Input.");
            }
        } while(i<nums);
            } catch (Exception e){
                System.out.println("Something went wrong!");
        }
    }
}