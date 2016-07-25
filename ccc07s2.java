import java.util.Scanner;
import java.util.Arrays;

public class ccc07s2 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int numBoxes = scan.nextInt();
      Prism[] box = new Prism[numBoxes];
      for (int i = 0 ; i < numBoxes ; i++){
         box[i] = new Prism(scan.nextInt(), scan.nextInt(),  scan.nextInt());
      }
      Arrays.sort(box);
      int numPackages = scan.nextInt();
      for (int i = 0 ; i < numPackages ; i++) {
         Prism pack = new Prism (scan.nextInt(), scan.nextInt(),  scan.nextInt());
         String vol = "Item does not fit.";
         for (int j = 0 ; j < numBoxes ; j++) {
            if (pack.sides[0] <= box[j].sides[0] && pack.sides[1] <= box[j].sides[1] && pack.sides[2] <= box[j].sides[2]) {
               vol = Integer.toString(box[j].volume);
               j = numBoxes;
            }
         }
         System.out.println(vol);
      }
   }
}
class Prism implements Comparable<Prism> {
   public int[] sides;
   public int volume;
   public Prism (int a, int b, int c) {
      int[] temp = {a, b, c};
      Arrays.sort(temp);
      this.sides = temp;
      volume = sides[0] *  sides[1] *  sides[2];
   }
   public int compareTo (Prism p) {
      if (p.volume == volume ) {
         return 0;
      } else if (p.volume > volume) {
         return -1;
      } else {
         return 1;
      }
   }
}
