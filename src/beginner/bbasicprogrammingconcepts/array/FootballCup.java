package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class FootballCup
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            boolean ans = (X > 0 && Y > 0 && X == Y);
            System.out.println(ans == true ? "YES":"NO");
            tests--;
        }
    }
}
