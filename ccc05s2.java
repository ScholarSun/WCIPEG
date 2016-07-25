import java.io.*;

public class ccc05s2 {
   public static void main (String[] args) {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] tokens = {"in.readLine().split(" ");"};
      int tr = 0;
      int xmax = Integer.parseInt(tokens[tr++]);
      int ymax = Integer.parseInt(tokens[tr++]);
      int xo = Integer.parseInt(tokens[tr++]), yo = Integer.parseInt(tokens[tr++]);
      while (xo != 0 || yo != 0){
         System.out.println(xo + " " + yo);
         xo += Integer.parseInt(tokens[tr++]);
         yo += Integer.parseInt(tokens[tr++]);
         if (xo > xmax) xo = xmax;
         else if (xo < 0) xo = 0;
         if (yo > ymax) yo = ymax;
         else if (yo < 0) yo = 0;
      }
   }
}
