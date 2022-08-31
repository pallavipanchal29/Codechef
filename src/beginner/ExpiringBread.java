package beginner;

import java.io.IOException;
import java.util.Scanner;

public class ExpiringBread
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int loaves = sc.nextInt();
            int expireAfter = sc.nextInt();
            int canEat = sc.nextInt();
            int day = 0;
            boolean ans = true;

            while (loaves > 0 && day < expireAfter)
            {
                loaves = loaves - canEat;
                day++;
            }
            if(loaves > 0)
                ans = false;

            System.out.println(ans == true ? "Yes" : "No");
            tests--;
        }
    }
}
