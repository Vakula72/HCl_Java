//E-Commerce Order Processing System
import java.util.*;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
     
      String conname = "Raghuveer";
      double price = 9000;
      int age = 90;
        
        //age verf
      Predicate<Integer> eligble = a->a >= 18;
   

    Function<Double, Double> discount  = p-> p -(p* 0.10);
      
      //accept the data
    Consumer<String> confirm = name ->System.out.println("order placed by "+ name);
 
   //genrate
    Supplier<Integer> orderId = ()->new Random().nextInt(9000)+ 1000;

      
      if(eligble.test(age)){
        double finalprice = discount.apply(price);

        confirm.accept(conname);

        System.out.println("orderid "+ orderId.get());
     

     //final price
    

      Consumer<String> print = System.out::println;

      print.accept("Thank you for shopping");


    }
}
