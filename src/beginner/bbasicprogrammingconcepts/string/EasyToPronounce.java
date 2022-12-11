package beginner.bbasicprogrammingconcepts.string;

import java.util.Scanner;

public class EasyToPronounce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            String inp = sc.next();
            int cnt = 0;
            for (int i = 0; i < inp.length(); i++) {
                if (!isVowel(inp.charAt(i))) {
                    cnt++;
                    if (cnt >= 4) {
                        System.out.println("NO");
                        break;
                    }
                } else
                    cnt = 0;
            }
            if (cnt < 4)
                System.out.println("YES");
            t--;
        }
    }

    static boolean isVowel(char ch) {
        return "aeiou".contains(String.valueOf(ch));
    }

}
