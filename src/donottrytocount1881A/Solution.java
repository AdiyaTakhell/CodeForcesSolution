package donottrytocount1881A;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {


            byte n = scanner.nextByte();
            byte m = scanner.nextByte();

            StringBuilder x = new StringBuilder(scanner.next());
            String s = scanner.next();

            int operations = 0;

            while (x.indexOf(s) == -1 && x.length() <= n + m) {
                x.append(x);
                operations++;
            }

            System.out.println(x.indexOf(s) != -1 ? operations : -1);
        }
    }
}