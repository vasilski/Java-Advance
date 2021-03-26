package A06SetAndMapAdvanceLab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01ParkingLot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        while (!"END".equals(input)) {
           String[] split = input.split(", ");

           if ("IN".equals(split[0])){
               parking.add(split[1]);
           } else {
               parking.remove(split[1]);
           }

            input = scan.nextLine();
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }

        for (String car : parking) {
            System.out.println(car);
        }
    }
}
