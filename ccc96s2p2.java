import java.io.*;
import java.util.*;

public class ccc96s2p2 {
    static PrintWriter out;
    public static void main (String[] args) {
        FastInput scan = new FastInput();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        boolean[][] possible = new boolean[4][10];
        Arrays.fill(possible, false);
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
}
