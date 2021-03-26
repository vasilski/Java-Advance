package A07SetAndMapAdvanceEx;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        Set<String> uniqueName = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            String name = scan.nextLine();
            uniqueName.add(name);
        }

        for (String s : uniqueName) {
            System.out.println(s);
        }
    }
}
