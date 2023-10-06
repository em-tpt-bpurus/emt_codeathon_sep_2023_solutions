package src.main.java.emt.purush;
import java.util.Scanner;
public class Codeathon03_Purush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many tress");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter respective length");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int maxTravelTime = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int clockwiseLength = (n - j + i) % n;
                int anticlockwiseLength = (j - i + n) % n;
                int shortLength = Math.min(clockwiseLength, anticlockwiseLength);
                int totalLength = shortLength + heights[i] + heights[j];

                if (totalLength > maxTravelTime) {
                    maxTravelTime = totalLength;
                }
            }
        }
        System.out.println("Output:");
        System.out.println(maxTravelTime);
    }
}
