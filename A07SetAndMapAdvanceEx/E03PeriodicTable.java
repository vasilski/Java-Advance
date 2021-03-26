package A07SetAndMapAdvanceEx;

import java.util.*;

public class E03PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            Collections.addAll(periodicTable, elements);
            //periodicTable.addAll(Arrays.asList(elements)); duplicate, makes the same process like the up row
        }
        for (String element : periodicTable) {
            System.out.printf("%s ", element);
        }
    }
}
