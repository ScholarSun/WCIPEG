import java.io.*;
import java.util.*;

public class climb {
   static PrintWriter out;
   public static void main (String[] args) {
      FastInput scan = new FastInput();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int num = scan.nextInt();
      int jump = scan.nextInt();
      int energy = scan.nextInt();
      int dist = 0;
      boolean check = true;
      for (int i =0 ; i < num ; i++){
         int next = scan.nextInt();
         if (next - dist <= jump){
            dist = next;
         } else if (energy > 0 && next - dist <= jump * 2) {
            energy--;
            dist = next;
         } else {
            i = num;
            check = false;
         }
      }
      out.println(check ? "Too easy!" : "Unfair!");
      out.close();
   }
}

class FastInput {
     BufferedReader br;
     StringTokenizer st;
     public FastInput() { br = new BufferedReader(new InputStreamReader(System.in)); }
     String next() {
         while (st == null || !st.hasMoreElements()) {
             try { st = new StringTokenizer(br.readLine()); }
             catch (IOException e) { e.printStackTrace(); }
         }
         return st.nextToken();
     }
     int nextInt() { return Integer.parseInt(next()); }
     long nextLong() { return Long.parseLong(next()); }
     double nextDouble() { return Double.parseDouble(next()); }
     String nextLine(){
         String str = "";
         try { str = br.readLine(); }
         catch (IOException e) { e.printStackTrace(); }
         return str;
     }
  }
