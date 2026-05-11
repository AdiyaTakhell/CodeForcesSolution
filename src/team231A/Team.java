package team231A;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int problemCount = scanner.nextInt();
        int solvableProblems = countSolvableProblems(scanner, problemCount);

        System.out.println(solvableProblems);
        scanner.close();
    }

    private static int countSolvableProblems(Scanner scanner, int problemCount) {
        int solvableCount = 0;

        for (int i = 0; i < problemCount; i++) {
            int confidentFriends = 0;

            for (int j = 0; j < 3; j++) {
                if (scanner.nextInt() == 1) {
                    confidentFriends++;
                }
            }

            if (confidentFriends >= 2) {
                solvableCount++;
            }
        }

        return solvableCount;
    }
}