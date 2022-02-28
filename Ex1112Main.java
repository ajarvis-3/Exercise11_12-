import java.util.*;
public class Ex1112Main {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   ArrayList<Double> list = new ArrayList<>();
   
   Method m = new Method();
   double sum = 0;
   System.out.println("Enter 5 numbers");
   list.add(input.nextDouble());
   list.add(input.nextDouble());
   list.add(input.nextDouble());
   list.add(input.nextDouble());
   list.add(input.nextDouble());
   
   sum = m.sum(list); // Run sum method and use list for it
   System.out.println("Sum: " + sum);
   input.close();
 }
}
