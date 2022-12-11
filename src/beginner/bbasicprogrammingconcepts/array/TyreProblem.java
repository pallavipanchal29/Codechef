package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class TyreProblem
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int bikes = sc.nextInt();
            int cars = sc.nextInt();
            System.out.println(bikes * 2 +cars * 4);
            tests--;
        }
    }
}
