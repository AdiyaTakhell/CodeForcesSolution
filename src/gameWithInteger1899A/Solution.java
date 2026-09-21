package gameWithInteger1899A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();
        while (t > 0) {
            int n = sc.nextInt();

            if ((n % 3 != 0)) {
                output.append("First\n");
            } else {
                output.append("Second\n");
            }
            t--;
        }
        System.out.println(output.toString());
    }
}
