package beginner;

import java.util.Scanner;

public class MaximiseTastiness
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(Math.max(Math.max((a+c),(a+d)),Math.max((b+c),(b+d))));

            tests--;
        }
    }
}
