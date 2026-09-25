package contest.turnintoapalindrome;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();
            char c = scanner.next().charAt(0);
            String s = scanner.next();

            int count = 0;

            for (int i = 0; i < n / 2; i++) {

                char left = s.charAt(i);
                char right = s.charAt(n - 1 - i);

                if (left != right) {

                    if (left == c || right == c) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}