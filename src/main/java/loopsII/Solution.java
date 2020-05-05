package loopsII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int y = 0; y < n; y++) {
                if (y == 0) {
                    arr[y] = a + pow(2, y) * b;
                } else {
                    arr[y] = pow(2, y) * b + arr[y - 1];
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i1 : arr) {
                sb.append(i1).append(" ");
            }
            System.out.println(sb);
        }
        in.close();
    }

    static int pow(int number, int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Power must be equal to or greater than zero.");
        }
        int res = 1;
        for (int i = 1; i <= power; i++) {
            res *= number;
        }
        return res;
    }
}
