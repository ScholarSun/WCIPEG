import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String lin = scan.next();
        if (lin.substring(lin.length()-2).equals("PM") && !lin.substring(0, 2).equals("12")){
           int x = ((Integer.parseInt(lin.substring(0, 2)) + 12)%24);
           if (x < 10) {
             lin = "0" + x + lin.substring(2);
          } else {
             lin = "" + x + lin.substring(2);
          }
       } else if (lin.substring(0, 2).equals("12") && lin.substring(lin.length()-2).equals("AM")){
           lin = "00" + lin.substring(2);
        }
        System.out.println(lin.substring(0, lin.length() -2));
    }
}
