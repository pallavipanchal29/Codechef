package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowManyUnattemptedProblems
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            System.out.println(X - Y);
            tests--;
        }
    }
}
