package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RollerCoaster
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
            int H = Integer.parseInt(input[1]);

            System.out.println(X >= H ? "YES": "NO");
            tests--;
        }
    }
}
