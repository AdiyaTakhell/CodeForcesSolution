package petyaAndStrings112A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();

        int result = first.compareToIgnoreCase(second);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

