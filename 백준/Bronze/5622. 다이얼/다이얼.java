import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split("");
        int answer = 0;
        for(int i = 0; i < split.length; i++){
            if(split[i].equals("A")||split[i].equals("B")||split[i].equals("C")) answer += 3;
            else if(split[i].equals("D")||split[i].equals("E")||split[i].equals("F")) answer += 4;
            else if(split[i].equals("G")||split[i].equals("H")||split[i].equals("I")) answer += 5;
            else if(split[i].equals("J")||split[i].equals("K")||split[i].equals("L")) answer += 6;
            else if(split[i].equals("M")||split[i].equals("N")||split[i].equals("O")) answer += 7;
            else if(split[i].equals("P")||split[i].equals("Q")||split[i].equals("R")||split[i].equals("S")) answer += 8;
            else if(split[i].equals("T")||split[i].equals("U")||split[i].equals("V")) answer += 9;
            else if(split[i].equals("W")||split[i].equals("X")||split[i].equals("Y")||split[i].equals("Z")) answer += 10;
        }
        System.out.println(answer);
    }
}