package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class VolumeControl
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int intial = sc.nextInt();
            int finalVol = sc.nextInt();

            System.out.println(Math.abs(finalVol - intial));
            tests--;
        }
    }
}
