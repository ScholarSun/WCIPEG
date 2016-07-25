import java.util.Scanner;

public class dwitesep09p1 {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      for (int asdf = 0 ; asdf < 5 ; asdf++){
         int low = scan.nextInt(), high = scan.nextInt(), spaCount = 0, sum = 0;

         for (int qwe = low; qwe <= high; qwe++){//checks all numbers between bounds
            boolean spa = true;
            String num = Integer.toString(qwe);

            for (int i = 1; i < num.length() && spa; i++)//checks to make sure each digit is greater than next
               if (num.charAt(i) <= num.charAt(i-1))
                  spa = false;

            for (int i = 0 ; i < num.length() && spa; i++) //checks if sum is even
               sum += num.charAt(i) - '0';
            if (sum % 2 != 0)
               spa = false;

            for (int j = 2; j < Math.sqrt(qwe)+1 && spa; j++) //checks if divisble my any square other than 1
               if (qwe % (j*j) == 0)
                  spa = false;

            if (spa)
               spaCount++;
         }
         System.out.println(spaCount);
      }

   }
}
