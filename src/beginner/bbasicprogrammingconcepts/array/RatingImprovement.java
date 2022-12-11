package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RatingImprovement
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int currentRating = Integer.parseInt(input[0]);
            int difficulty = Integer.parseInt(input[1]);
            if(difficulty >=currentRating && difficulty <= (currentRating+200))
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            tests--;
        }
    }
}
