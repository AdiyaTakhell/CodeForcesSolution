package doremypaint1890A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() == 1) {
                System.out.println("Yes");
            } else if (freq.size() == 2) {
                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int count : freq.values()) {
                    max = Math.max(max, count);
                    min = Math.min(min, count);
                }

                if (max - min <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}