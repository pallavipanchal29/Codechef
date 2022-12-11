package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class EzioAndGuards
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int atmost = sc.nextInt();
            int guards = sc.nextInt();

            System.out.println(atmost >= guards ? "YES" : "NO");
            tests--;
        }
    }
}
