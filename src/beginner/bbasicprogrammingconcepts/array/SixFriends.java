package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class SixFriends
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int doubleRoomCost = sc.nextInt();
            int tripleRoomCost = sc.nextInt();

            int cost1 = 3 * doubleRoomCost;
            int cost2 = 2 * tripleRoomCost;

            System.out.println(Math.min(cost1,cost2));
            tests--;
        }
    }
}
