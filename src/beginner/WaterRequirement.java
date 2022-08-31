package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterRequirement
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            int hours = Integer.parseInt(br.readLine());
            System.out.println(hours * 2);
            tests--;
        }
    }
}
