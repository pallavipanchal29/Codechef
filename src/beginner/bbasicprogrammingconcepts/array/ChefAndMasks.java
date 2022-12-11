package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class ChefAndMasks
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int costPerDisposable = sc.nextInt();
            int costPerCloth = sc.nextInt();
            String ans = "";
            int cost1 = costPerDisposable * 100;
            int cost2 = costPerCloth * 10;

            if(cost1 == cost2 || cost2 < cost1)
                ans = "Cloth";
            else if(cost1 < cost2)
                ans = "Disposable";

            System.out.println(ans);
            tests--;
        }
    }
}
