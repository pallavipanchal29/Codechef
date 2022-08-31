package beginner.bbasicprogrammingconcepts;

import javax.swing.text.NumberFormatter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM
{
    public static void main (String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

            int toWinthdraw = sc.nextInt();
            double initial = sc.nextDouble();

            double remainBal = initial - toWinthdraw-0.5;
            DecimalFormat d = new DecimalFormat("#.##");

            System.out.println(d.format(remainBal));
    }
}
