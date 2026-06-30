package lineTrip1901A;

import java.io.*;
import java.util.StringTokenizer;

public class LineTrip {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            solveCase();
        }
        out.flush();
    }
    static void solveCase() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int prev = 0, maxGap = 0, last = 0;

        for (int i = 0; i < n; i++) {
            int station = Integer.parseInt(st.nextToken());
            maxGap = Math.max(maxGap, station - prev);
            prev = station;
            last = station;
        }


        maxGap = Math.max(maxGap, x - last);

        maxGap = Math.max(maxGap, 2 * (x - last));

        out.println(maxGap);
    }
}
