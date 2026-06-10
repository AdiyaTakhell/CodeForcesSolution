package halloumiBoxes1903A;

import java.util.Scanner;

public class HalloumiBoxes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] box = new int[n];
            for (int i = 0; i < n; i++) {
                box[i] = scanner.nextInt();
            }
            if (k > 1) {
                System.out.println("YES");
            } else {
                boolean sorted = true;
                for (int i = 1; i < n; i++) {
                    if (box[i] < box[i - 1]) {
                        sorted = false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            }

        }


    }
}
