package beginner.basicmaths;

import java.util.Scanner;

public class MakeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int C = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();

            int q = 0, w = 0;
            for (int i = 0; i < N; i++) {
                if ((X - arr[i]) > C) // to find optimal cost - >
                // if difference is more than cost that means element is smaller so its better to increase it to X so as to maximize answer
                {
                    arr[i] = X;
                    q += C; // increase the cost - part of answer
                }
                w += arr[i]; // summation of array elements
            }
            System.out.println(w - q);
            tests--;
        }
    }
}
