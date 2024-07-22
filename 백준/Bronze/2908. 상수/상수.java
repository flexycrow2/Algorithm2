import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        int aa = Main.reverse(a);
        int bb = Main.reverse(b);

        answer(aa, bb);
    }

    static int reverse (String a){
        StringBuilder sb = new StringBuilder(a);
        StringBuilder reverse = sb.reverse();
        return Integer.parseInt(reverse.toString());
    }

    static void answer (int aa, int bb){
        System.out.println(Math.max(aa, bb));
    }
}
