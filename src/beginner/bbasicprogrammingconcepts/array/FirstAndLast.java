package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAndLast
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            int size = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] input = line.split(" ");
            int[] arr = new int[input.length];
            for(int i = 0;i<input.length;i++)
                arr[i] = Integer.parseInt(input[i]);

            int max = Integer.MIN_VALUE;
            if(size <= 2)
            {
                int sum = 0;
                int i = 0;
                while (i < size)
                    sum = sum + arr[i];
                System.out.println(sum);
                return;
            }
            


            tests--;
        }
    }
}
