package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Lunchtime
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int currentTime = sc.nextInt();

            System.out.println(currentTime >= 1 && currentTime <= 4? "YES":"NO");
            tests--;
        }
    }
}
