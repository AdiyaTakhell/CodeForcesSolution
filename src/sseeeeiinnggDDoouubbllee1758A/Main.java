package sseeeeiinnggDDoouubbllee1758A;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            out.append(s).append(new StringBuilder(s).reverse()).append("\n");
        }
        System.out.print(out);
    }
}
