package beginner.bbasicprogrammingconcepts.array;

import java.util.Scanner;

public class MileageMatters
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b);

            tests--;
        }
    }
}
