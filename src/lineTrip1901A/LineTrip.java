package lineTrip1901A;

import java.io.*;
import java.util.*;

public class LineTrip {

    static FastIO io = new FastIO();

    public static void main(String[] args) throws Exception {


         int t = io.nextInt();

        while (t-- > 0) {
            solve();
        }

        io.close();
    }

    static void solve() throws Exception {
        int n = io.nextInt();
        int x = io.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = io.nextInt();
        }

        int maxDist = 2 * (x - a[n - 1]);

        maxDist = Math.max(maxDist, a[0]);

        for (int i = 1; i < n; i++) {
            int dist = a[i] - a[i - 1];
            maxDist = Math.max(maxDist, dist);
        }

        io.out.println(maxDist);

    }

    static class FastIO {
        private final BufferedReader br;
        private StringTokenizer st;
        PrintWriter out;

        FastIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        short nextShort() throws IOException {
            return Short.parseShort(next());
        }

        byte nextByte() throws IOException {
            return Byte.parseByte(next());
        }

        boolean nextBoolean() throws IOException {
            return Boolean.parseBoolean(next());
        }

        char nextChar() throws IOException {
            return next().charAt(0);
        }

        String nextLine() throws IOException {
            st = null;
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = nextLong();
            return arr;
        }

        double[] nextDoubleArray(int n) throws IOException {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) arr[i] = nextDouble();
            return arr;
        }

        char[] nextCharArray() throws IOException {
            return next().toCharArray();
        }

        void close() {
            out.flush();
            out.close();
        }
    }
}