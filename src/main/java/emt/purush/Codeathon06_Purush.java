package emt.purush;
import java.util.*;

public class Codeathon06_Purush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of list values:");
        int n = sc.nextInt();

        List<String> list1 = getList(n, sc, "Enter List values 1");
        List<String> list2 = getList(n, sc, "Enter List values 2");

        Map<String, List<String>> resultMap = new HashMap<>();
        System.out.println("Output:");
        for (String text : list1) {
            List<String> matchedFruits = findFruits(text, list2);

            resultMap.put(text, matchedFruits);
        }
        for (String list1String : list1) {
            List<String> matchedFruits = resultMap.get(list1String);
            System.out.print(list1String + ": ");
            if (matchedFruits.isEmpty()) {
                System.out.println("[No Fruit]");
            } else {
                System.out.println(String.join(", ", matchedFruits));
            }
        }
    }
    private static List<String> getList(int n, Scanner sc, String listName) {
        System.out.println(listName);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        return list;
    }
    private static List<String> findFruits(String numberString, List<String> list2) {
        char elements = findLetters(numberString);
        List<String> matchedFruits = new ArrayList<>();

        for (String fruit : list2) {
            if (fruit.length() == elements - 'A' + 1) {
                matchedFruits.add(fruit);
            }
        }
        return matchedFruits;
    }
    private static char findLetters(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                return Character.toUpperCase(c);
            }
        }
        return ' ';
    }
}


