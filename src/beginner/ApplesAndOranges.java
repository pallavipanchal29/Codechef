package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ApplesAndOranges
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int applePerKg = sc.nextInt();
        int orangePerKg = sc.nextInt();
        int a=applePerKg+orangePerKg;
        if(a<=money){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
