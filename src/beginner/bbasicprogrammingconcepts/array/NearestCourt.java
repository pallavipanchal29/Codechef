package beginner.bbasicprogrammingconcepts.array;

import java.util.Scanner;

public class NearestCourt
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = (Math.abs(x-y)+1)/2;
            System.out.println(ans);
            tests--;
        }
    }
}
