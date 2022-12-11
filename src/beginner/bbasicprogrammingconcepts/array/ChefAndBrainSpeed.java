package beginner.bbasicprogrammingconcepts.array;

import java.util.Scanner;

public class ChefAndBrainSpeed
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int threashhold = Integer.parseInt(input[0]);
        int speed = Integer.parseInt(input[1]);

        System.out.println(speed > threashhold ? "YES": "NO");
    }
}
