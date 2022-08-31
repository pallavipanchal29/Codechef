package beginner;

import java.io.IOException;
import java.util.Scanner;

public class IdAndShip
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char s;
        for(int i=0;i<t;i++)
        {
            s=sc.next().charAt(0);
            if(s=='b'||s=='B'){
                System.out.println("BattleShip");
            }
            else if(s=='c'||s=='C'){
                System.out.println("Cruiser");
            }
            else if(s=='D'||s=='d'){
                System.out.println("Destroyer");
            }
            else if(s=='f'||s=='F'){
                System.out.println("Frigate");
            }
        }
    }
}
