package Q4;

import java.util.Scanner;

public class Main {
    private static String ConcatERemove(String s, String t, int k) {
        int common = 0;
        for (; common < s.length() && common < t.length(); common++)
            if (s.charAt(common) != t.charAt(common)) break;

        int min_op = (s.length() + t.length() - 2*common);
        int extra = k - min_op;
        if (extra >= 0 && extra % 2 == 0) return "sim";
        if (extra >= 2*common) return "sim";
        return "não";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(ConcatERemove(s, t, k));
    }
}
