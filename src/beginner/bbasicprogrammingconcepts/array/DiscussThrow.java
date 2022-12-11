package beginner.bbasicprogrammingconcepts.array;

import java.util.Scanner;

public class DiscussThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Math.max(Math.max(a, b), c);
            System.out.println(max);
            tests--;
        }
    }
}
