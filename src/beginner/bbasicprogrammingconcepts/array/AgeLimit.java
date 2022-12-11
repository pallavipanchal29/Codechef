package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class AgeLimit
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int minAgeLimit = sc.nextInt();
            int maxAgeLimit = sc.nextInt();
            int currentAge = sc.nextInt();
            System.out.println(currentAge >= minAgeLimit && currentAge < maxAgeLimit ? "YES":"NO");
            tests--;
        }
    }
}
