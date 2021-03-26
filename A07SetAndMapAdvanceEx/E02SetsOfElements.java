package A07SetAndMapAdvanceEx;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] num = scan.nextLine().split(" ");

        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        Set<Integer> first = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            first.add(number);
        }
        Set<Integer> second = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scan.nextLine());
            second.add(number);
        }

        second.retainAll(first);
        for (Integer integer : second) {
            System.out.print(integer + " ");
        }
    }
}
