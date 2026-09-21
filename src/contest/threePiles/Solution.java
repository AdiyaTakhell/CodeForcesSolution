package contest.threePiles;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long answer = Math.max(
                    Math.abs(a - b),
                    Math.abs(a + c - b)
            );

            System.out.println(answer);
        }

        scanner.close();
    }
}
