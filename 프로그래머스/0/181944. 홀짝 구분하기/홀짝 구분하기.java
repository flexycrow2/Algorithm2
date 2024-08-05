import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
    }
    
    static void isEven(int i){
        if(i % 2 == 0) System.out.println(i + " is even");
        else System.out.println(i + " is odd");
    }
}