package beginner;

import java.util.Scanner;

public class Discount
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int d = sc.nextInt();
            System.out.println(100 - d);

            tests--;
        }
    }
}
