package beginner;

import java.io.IOException;
import java.util.Scanner;

public class TheCheaperCab
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int cab1 = sc.nextInt();
            int cab2 = sc.nextInt();
            System.out.println(cab1 == cab2 ? "ANY" : (cab1 < cab2 ? "FIRST" : "SECOND"));
            tests--;
        }
    }
}
