package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetermineWinner
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int pa = Integer.parseInt(input[0]);
            int pb = Integer.parseInt(input[1]);
            int qa = Integer.parseInt(input[2]);
            int qb = Integer.parseInt(input[3]);

            int pPenulty = Math.max(pa,pb);
            int qPenulty = Math.max(qa,qb);
            System.out.println(pPenulty == qPenulty ? "TIE" :(pPenulty < qPenulty ? "P" : "Q"));

            tests--;
        }
    }
}
