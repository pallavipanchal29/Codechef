package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class ValidTriangles
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b + c;

            System.out.println(sum == 180 ? "YES" : "NO");
            tests--;
        }
    }
}
