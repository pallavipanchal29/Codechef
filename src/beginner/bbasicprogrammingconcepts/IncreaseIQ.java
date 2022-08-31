package beginner.bbasicprogrammingconcepts;

import java.io.IOException;
import java.util.Scanner;

public class IncreaseIQ
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        System.out.println(score + 7 > 170 ? "Yes" : "No");

    }
}
