package nextRound158A;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int qualifyingScore = 0;
        int qualifiedCount = 0;

        for (int i = 1; i <= n; i++) {

            int score = scanner.nextInt();

            if (i == k) {
                qualifyingScore = score;
            }

            if (score > 0 && score >= qualifyingScore) {
                qualifiedCount++;
            }
        }

        System.out.println(qualifiedCount);

        scanner.close();
    }
}