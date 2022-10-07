package oop_calesa;

import java.util.ArrayList;



public class Person<Name> {
    public static ArrayList<Object> persons;
    private Name key;
    private int Age;
  
    public void setName(Name key) {
        this.key = key;
        
    }
    public void setAge(int Age){
        this.Age = Age;
    }
  
    public Name getName(){ 
        return key; 
    }
    
    public int getAge() { 
        return Age; 
    }
  
   
}
