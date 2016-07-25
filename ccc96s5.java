import java.util.Scanner;

public class ccc96s5 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      for (int asdf = 0 ; asdf < num ; asdf++){
         int len = scan.nextInt(), max = 0;
         int[] x = new int[len];
         int[] y = new int[len];
         for (int i = 0 ; i < len ; i++)
            x[i] = scan.nextInt();
         for (int i = 0 ; i < len ; i++)
            y[i] = scan.nextInt();
         for (int i = len-1, j = len-1; i >= 0 && j >=0 ; i--) {
            while (j > i && y[j] < x[i])
               j--;
            if (y[j] >= x[i] )
               max = j-i > max ? j-i : max;
         }
         System.out.println("The maximum distance is " + max);
      }
   }
}
