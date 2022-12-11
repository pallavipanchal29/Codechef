package beginner.basicmaths;

import java.util.Scanner;

public class SlowSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();

            int max = 0;
            while (maxT > 0 && sumN > 0) {
                max += (int) Math.pow(Math.min(maxN, sumN), 2);
                sumN -= Math.min(maxN, sumN);
                maxT--;
            }
            System.out.println(max);
            t--;
        }
    }
}
