package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetSubscription
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            int duration = Integer.parseInt(br.readLine());
            System.out.println(duration > 30 ? "YES" : "NO");
            tests--;
        }
    }
}
