package soldierAndBananas546A;

import java.io.*;
import java.util.*;

public class SoldierAndBananas {
    static class FastIO {
        BufferedReader br;
        StringTokenizer st;
        PrintWriter out;

        FastIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
        double nextDouble() throws IOException { return Double.parseDouble(next()); }
        String nextLine() throws IOException { return br.readLine(); }
        char nextChar() throws IOException { return next().charAt(0); }

        void close() { out.flush(); out.close(); }
    }

    public static void main(String[] args) throws IOException {
        FastIO io = new FastIO();

        int k = io.nextInt();
        int n = io.nextInt();
        int w = io.nextInt();

        int totalCost = k * w * (w + 1) / 2;
        int borrow = Math.max(0, totalCost - n);

        io.out.println(borrow);
        io.close();
    }
}

