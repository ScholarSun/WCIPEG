import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out;
    public static void main (String[] args) {
        FastInput scan = new FastInput();
        out = new PrintWriter(new BufferedOutputStream(System.out));
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
