package beginner.bbasicprogrammingconcepts.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondMaxOfThreeNumbers
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int[] arr = new int[input.length];
            for(int i = 0;i<input.length;i++)
                arr[i] = Integer.parseInt(input[i]);

            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0;i<arr.length;i++)
            {
                queue.offer(arr[i]);
            }
            int count = 0;
            int second =0;
            while (!queue.isEmpty())
            {
                second = queue.poll();
                count++;
                if(count == 2) {
                    System.out.println(second);
                    break;
                }
            }
            tests--;
        }
    }
}
