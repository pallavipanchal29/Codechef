package beginner.bbasicprogrammingconcepts.string;

import java.util.Scanner;

public class ZeroOnesEqualOneZeroes {
    //Count of  01 should be equal to 10 that happens if we keep 1s at edge and fill middle with 0s
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                if (i == 0 || i == N - 1) {
                    System.out.print('1');
                } else {
                    System.out.print('0');
                }
            }
            System.out.println();
            t--;
        }
    }
}
