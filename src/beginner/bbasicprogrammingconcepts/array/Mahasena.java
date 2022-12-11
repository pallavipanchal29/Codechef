package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class Mahasena
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (total > 0)
        {
            int weapons = sc.nextInt();
            if(weapons % 2 == 0)
                even++;
            else
                odd++;
            total--;
        }
        System.out.println(even > odd ? "READY FOR BATTLE" : "NOT READY");
    }

}
