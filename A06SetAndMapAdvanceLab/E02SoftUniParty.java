package A06SetAndMapAdvanceLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E02SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String guest = scan.nextLine();

        TreeSet<String> regular = new TreeSet<>();
        TreeSet<String> vip = new TreeSet<>();

        while (!guest.equals("PARTY")) {

            char firstChar = guest.charAt(0);

            if (Character.isDigit(firstChar)) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }
            guest = scan.nextLine();

        }

        Set<String> arriveGuest = new LinkedHashSet<>();

        while (!guest.equals("END")) {
            arriveGuest.add(guest);
            vip.remove(guest);
            regular.remove(guest);
            guest = scan.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String g : vip) {
            System.out.println(g);
        }

        for (String g : regular) {
            System.out.println(g);
        }
    }
}
