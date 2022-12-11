package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualIntegers
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
            int P = X - Y;
            if (X<Y)
            {
                System.out.println(Y-X);
            }
            else if (X==Y)
            {
                System.out.println(0);
            }
            else if (Y<X)
            {
                if(P%2==0)
                {
                    System.out.println(P/2);
                }
                else if (P%2!=0)
                {
                    System.out.println((P/2)+2);
                }
            }
            tests--;
        }
    }
}
