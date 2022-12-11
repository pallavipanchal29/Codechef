package beginner.bbasicprogrammingconcepts.array;

import java.util.Scanner;

public class Fitness
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int d = sc.nextInt();
            System.out.println(d * 2 * 5);

            tests--;
        }
    }
}
