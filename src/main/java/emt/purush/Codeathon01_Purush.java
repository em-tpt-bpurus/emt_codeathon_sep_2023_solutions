package src.main.java.emt.purush;
import java.util.Scanner;

public class Codeathon01_Purush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numeric values:");
        int size = scanner.nextInt();
        boolean[] results = new boolean[size];
        System.out.println("Please enter string values:");
        for (int i = 0; i < size; i++) {
            String username = scanner.next().toLowerCase();
            results[i] = userChanged(username);
        }
        scanner.close();
        System.out.println("Output:");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i] ? "YES" : "NO");
            if (i < results.length - 1) {
            }
        }
    }
    public static boolean userChanged(String username) {
        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);
            for (int j = i + 1; j < username.length(); j++) {
                char nextChar = username.charAt(j);
                if (nextChar < currentChar) {
                    return true;
                }
            }
        }
        return false;
    }
}
