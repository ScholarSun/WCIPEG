import java.util.Scanner;

public class q4 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      for (int co = 0 ; co < num ; co++ ) {
         String[] board = { scan.next(), scan.next(), scan.next(), scan.next()};
         boolean row = false;
         for (int i = 0 ; i < 4 && !row; i++) {
            if (board[i].equals("XXXX"))
               row = true;
            if (board[0].charAt(i) == 'X' && board[1].charAt(i) == 'X' && board[2].charAt(i) == 'X' && board[3].charAt(i) == 'X')
               row = true;
         }
         if (board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X' && board[3].charAt(3) == 'X')
            row = true;
         if (board[0].charAt(3) == 'X' && board[1].charAt(2) == 'X' && board[2].charAt(1) == 'X' && board[3].charAt(0) == 'X')
            row = true;
         System.out.println(row ? "Yes" : "No");
      }
   }
}
