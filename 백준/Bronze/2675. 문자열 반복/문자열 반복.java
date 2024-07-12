import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int length = scanner.nextInt();
            String string = scanner.next();

            for (int j = 0; j < string.length(); j++) {
                for (int k = 0; k < length; k++){
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
