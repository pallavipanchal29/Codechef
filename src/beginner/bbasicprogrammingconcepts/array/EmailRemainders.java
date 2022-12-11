package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class EmailRemainders
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

            int total = sc.nextInt();
            int notToSend = sc.nextInt();

            System.out.println(Math.abs(total - notToSend));

    }
}
