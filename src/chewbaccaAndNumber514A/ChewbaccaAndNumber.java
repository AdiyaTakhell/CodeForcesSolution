package chewbaccaAndNumber514A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChewbaccaAndNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit > 4 && !(i == 0 && digit == 9)) {
                digit = 9 - digit;
            }

            ans.append(digit);
        }

        System.out.println(ans);
    }
}