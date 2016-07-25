import java.util.Scanner;

public class ccc99s1 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] card = new int[52];
      int a = 0, b = 0;
      for (int i = 0 ; i < 52 ; i++) {
         String car = scan.next();
         int c = 0;
         if (car.equals("jack")) {
            c = 1;
         } else if (car.equals("queen")) {
            c = 2;
         } else if (car.equals("king")) {
            c = 3;
         } else if (car.equals("ace")) {
            c = 4;
         }
         card[i] = c;
      }

      for (int i = 0 ; i < 52 ; i++) {
         if (card[i] > 0 && i + card[i] < 52) {
            boolean valid = true;
            for (int j = i+1; j < card[i] + i + 1 ; j++) {
               if (card[j] > 0) {
                  valid = false;
               }
            }
            if (valid) {
               if (i % 2 == 0) {
                  a+=card[i];
                  System.out.println("Player A scores " + card[i] + " point(s).");
               } else {
                  b+=card[i];
                  System.out.println("Player B scores " + card[i] + " point(s).");
               }
            }
         }
      }
      System.out.println("Player A: " + a + " point(s).");
      System.out.println("Player B: " + b + " point(s).");
   }
}
