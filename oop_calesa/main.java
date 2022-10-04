
package oop_calesa;

public class main {
    public static void main(String[] args) {
        object<Integer> newestNameAsInteger;
        newestNameAsInteger = new object<String>(15);
        System.out.println(newestNameAsInteger.getName());
  
        object<String> newestNameAsString;
        newestNameAsString = new object<String>("This is me, John!");
        System.out.println(newestNameAsString.getName());
    }
}