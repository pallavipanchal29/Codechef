package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNumbers
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            System.out.println(a + b);
            tests--;
        }
    }
}
