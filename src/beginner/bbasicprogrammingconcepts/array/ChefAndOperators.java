package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class ChefAndOperators
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a == b ? "=" : (a < b ? "<" : ">"));
            tests--;
        }
    }
}
