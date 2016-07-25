import java.util.Scanner;

public class ccc05j5 {
   public static boolean isWord(String s) {
      boolean toReturn = false;
      if (s.equals("A"))
         toReturn = true;
      else if (s.length() > 1)
         if (s.charAt(0) == 'A' && s.charAt(1) == 'N')
            toReturn = isWord(s.substring(2));
      else if (s.length() > 2)
         if (s.charAt(0) == 'B' && s.charAt(1) == 'A' && s.charAt(2) == 'N')
            toReturn = isWord(s.substring(3));
      return toReturn;
   }
   public static int isWordS(String s) {
      int toReturn = false;
      if (s.equals("A"))
         toReturn = 1;
      else if (s.length() > 1)
         if (s.charAt(0) == 'A' && s.charAt(1) == 'N')
            toReturn = isWord(s.substring(2)) ? 1 : 0;
      
   }
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      while (!word.equals("X")){
         boolean isWord = false;
         if (word.charAt(0) == 'A')
            isWord = isWord(word);
         else if (word.charAt(0) == 'B' && word.charAt(word.length()-1) == 'S')
            isWord = isWord(word.substring(1, word.length()-1));
         System.out.println(isWord ? "YES" : "NO");
         word = scan.next();
      }
   }
}
