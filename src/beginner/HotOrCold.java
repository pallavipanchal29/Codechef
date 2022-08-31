package beginner;

import java.util.Scanner;

public class HotOrCold
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int temp = sc.nextInt();
            if(temp > 20)
                System.out.println("HOT");
            else System.out.println("COLD");
            tests--;
        }

    }
}
