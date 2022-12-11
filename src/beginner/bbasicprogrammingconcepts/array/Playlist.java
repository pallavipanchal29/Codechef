package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Playlist
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int totalDuration = Integer.parseInt(input[0]);
            int duration = Integer.parseInt(input[1]);

            int ans = totalDuration / (duration * 3);
            System.out.println(ans);
            tests--;
        }
    }
}
