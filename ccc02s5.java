import java.util.Scanner;
import java.lang.Math.*;

public class ccc02s5 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int width = scan.nextInt(), height = scan.nextInt(), bottom = scan.nextInt(), right = scan.nextInt(), count = 0;
      double angle = Math.atan((width-bottom)/(height-right));
      int side = right, sideWant = 6, constraint = width;
      while (sideWant < constraint-5 && sideWant > 5){
         count++;
         sideWant = (int) (side * Math.tan(angle));
         angle = Math.PI/2 - angle;
         side = constraint - sideWant;

         if (count % 2 == 0)
            constraint = height;
         else
            constraint = width;

         if (count == 100000){
            count = 0;
            sideWant = 0;
         }
      }
      if (count > 0)
         count--;
      System.out.println(count);
   }
}
