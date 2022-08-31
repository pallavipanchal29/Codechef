package beginner.bbasicprogrammingconcepts;

import java.io.IOException;
import java.util.Scanner;

public class TheTwoDishes
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int max = sc.nextInt();
            int sum = sc.nextInt();
            int diff;

            if(sum<=max)
                diff = sum;
            else
                diff = (max-sum) + max;
            System.out.println(diff);

            tests--;
        }
    }
}
