package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class FillTheBucket
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int cap = sc.nextInt();
            int already = sc.nextInt();

            System.out.println(cap - already);
            tests--;
        }
    }
}
