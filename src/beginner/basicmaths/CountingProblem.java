package beginner.basicmaths;

import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 != 0)
                    cnt++;
            }
            //if odd numbers are greater than 0 and odd numbers count is even  then print yes
            //if only even numbers are present then product of sums can never be odd
            System.out.println((cnt % 2 == 0 & cnt != 0) ? "YES" : "NO");

            tests--;
        }
    }
}
