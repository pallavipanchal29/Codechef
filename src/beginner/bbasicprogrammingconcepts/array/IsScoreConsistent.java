package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class IsScoreConsistent
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            System.out.println((A <= C && B <= D) ? "POSSIBLE" : "IMPOSSIBLE");
            tests--;
        }
    }
}
