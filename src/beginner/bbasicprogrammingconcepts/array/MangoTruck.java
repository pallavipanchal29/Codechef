package beginner.bbasicprogrammingconcepts.array;

import java.io.IOException;
import java.util.Scanner;

public class MangoTruck
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int mangoWeight = sc.nextInt();
            int truckWeight = sc.nextInt();
            int bridgeStrenth = sc.nextInt();
            int m = (bridgeStrenth - truckWeight) / mangoWeight;
            System.out.println(m);
        }
    }
}
