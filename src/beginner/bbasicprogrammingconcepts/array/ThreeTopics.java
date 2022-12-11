package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class ThreeTopics
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = sc.nextInt();
        System.out.println((a == x || b == x || c == x) ? "Yes" : "No");

    }
}

