package loopsII;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int y = 0; y < n; y++) {
                if (y == 0) {
                    arr[y] = a + (int) Math.pow(2, y) * b;
                } else {
                    arr[y] = (int) Math.pow(2, y) * b + arr[y - 1];
                }
            }

            for (int i1 : arr) {
                System.out.println(i1);
            }
        }
        in.close();
    }
}
