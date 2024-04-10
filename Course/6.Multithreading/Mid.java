import java.util.*;
public class Mid {
 public static void main(String[] args) {
 // create an HashMap
 HashMap<Integer, String> numbers = new HashMap<>();
 numbers.put(1,"ONE");
 numbers.put(2,"TWO");
 numbers.put(3,"THREE");
 numbers.put(4,"FOUR");
 // get the value with key 1
 String value = numbers.get(2);
 System.out.println("HashMap Value with Key 1: " + value);
 }
}
