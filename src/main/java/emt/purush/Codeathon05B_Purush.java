package emt.purush;
import java.util.Scanner;
public class Codeathon05B_Purush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1");
        int var1 = sc.nextInt();
        System.out.println("Enter the value2");
        int var2 = sc.nextInt();
        var1 = var1 + var2;
        var2 = (var1 -  var2);
        var1 = (var1 - var2);
        System.out.println("Output:");
        System.out.println("var1 = " + ((int)(0.10*var1)));
        System.out.println("var2 = " + ((int)(0.20*var2)));
    }
}