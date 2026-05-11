package bit282A;

import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operations = scanner.nextInt();
        int x = 0;

        for (int i = 0; i < operations; i++) {

            String operation = scanner.next();

            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}
