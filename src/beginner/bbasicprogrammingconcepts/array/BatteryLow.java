package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class BatteryLow
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int level = sc.nextInt();
            System.out.println(level > 15 ? "No" : "Yes");
        }
    }
}
