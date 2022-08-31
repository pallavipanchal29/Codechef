package beginner;

import java.util.Scanner;

public class NButtonsOneBulb
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests > 0)
        {
            int num = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String r = sc.nextLine();

            int i = 0;
            int count = 0;
            while (i < num)
            {
                if(s.charAt(i) != r.charAt(i))
                    count++;
                i++;
            }
            if(count % 2 == 0)
                System.out.println(1);
            else System.out.println(0);

            tests--;
        }
    }
}
