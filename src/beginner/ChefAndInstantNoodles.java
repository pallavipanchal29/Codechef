package beginner;

import java.io.IOException;
import java.util.Scanner;

public class ChefAndInstantNoodles
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

            int noOfStoves = sc.nextInt();
            int minutes = sc.nextInt();
            int canCook = noOfStoves * minutes;
            System.out.println(canCook);

    }
}
