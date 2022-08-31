package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefAndChocolates
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests > 0)
        {
            String line = br.readLine();
            String[] input = line.split(" ");
            int noOf5RupeeCoins = Integer.parseInt(input[0]);
            int noOf10RupeeCoins = Integer.parseInt(input[1]);
            int cost = Integer.parseInt(input[2]);

            int total = noOf5RupeeCoins * 5 + noOf10RupeeCoins * 10;
            int canBuy = total / cost;
            System.out.println(canBuy);
            tests--;
        }
    }
}
