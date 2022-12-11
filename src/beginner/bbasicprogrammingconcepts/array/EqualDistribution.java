package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class EqualDistribution
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(((A+B) % 2 == 0) ? "YES":"NO");
            tests--;
        }
    }
}
