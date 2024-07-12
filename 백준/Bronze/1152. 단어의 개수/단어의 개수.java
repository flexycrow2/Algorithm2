//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
//        System.out.println(array.length);
//        System.out.println(Arrays.toString(array));
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("")) count++;
        }

        System.out.println(array.length - count);
    }
}
