package beginner;

import java.io.IOException;
import java.util.Scanner;

public class ChefGivesParty
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int totalFriends = sc.nextInt();
            int costPerBurger = sc.nextInt();
            int totalRupees = sc.nextInt();

            int totalCost = costPerBurger * totalFriends;

            System.out.println(totalCost <= totalRupees? "YES":"NO");
            tests--;
        }
    }
}
