package contest;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int result = 0;
            byte n = scanner.nextByte();
            for (int i = 1; i <= 3; i++) {
                byte a = scanner.nextByte();
                int s = n - a;
                if (s > result) {
                    result = s;
                }

            }
            System.out.println(result);
        }
    }
}
