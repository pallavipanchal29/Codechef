package beginner.bbasicprogrammingconcepts;

import java.io.IOException;
import java.util.Scanner;

public class CreditScore
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 750)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

