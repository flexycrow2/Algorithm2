import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();

        int sum = 0;
        String[] array = string.split("");
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(array[i]);
        }
        System.out.println(sum);
    }
}