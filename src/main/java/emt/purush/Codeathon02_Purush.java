
package emt.purush;
import java.util.*;
public class Codeathon02_Purush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter  numbers");
        int n = sc.nextInt();
        List<String> customers = new ArrayList<>();
        System.out.println("please enter  words");
        for (int i = 0; i < n; i++) {
            customers.add(sc.next());
        }

        List<String> result = thenActive(customers);

        Collections.sort(result);
        System.out.println("Output:");
        for (String customer : result) {
            System.out.println(customer);
        }
    }

    public static List<String> thenActive(List<String> customers) {
        Map<String, Integer> customerCounts = new HashMap<>();

        for (String customer : customers) {
            customerCounts.put(customer, customerCounts.getOrDefault(customer, 0) + 1);
        }

        List<String> activeCustomers = new ArrayList<>();
        int threshold = (int) Math.ceil(customers.size() * 0.05);

        for (Map.Entry<String, Integer> entry : customerCounts.entrySet()) {
            if (entry.getValue() >= threshold) {
                activeCustomers.add(entry.getKey());
            }
        }

        return activeCustomers;
    }
}
