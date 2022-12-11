package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndChapters
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int courses = Integer.parseInt(input[0]);
            int units = Integer.parseInt(input[1]);
            int chapters = Integer.parseInt(input[2]);
            System.out.println(courses * units * chapters);
            tests--;
        }
    }
}
