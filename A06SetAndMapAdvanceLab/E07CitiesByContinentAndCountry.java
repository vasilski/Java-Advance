package A06SetAndMapAdvanceLab;

import java.util.*;

public class E07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, List<String>>> earth = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] token = scan.nextLine().split("\\s+");

            String continent = token[0];
            String country = token[1];
            String city = token[2];

            if (!earth.containsKey(continent)) {
                earth.put(continent, new LinkedHashMap<>());
                earth.get(continent).put(country, new ArrayList<>());
            } else {
                if (!earth.get(continent).containsKey(country)) {
                    earth.get(continent).put(country, new ArrayList<>());
                }
            }
            earth.get(continent).get(country).add(city);
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : earth.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> innerEntry : entry.getValue().entrySet()) {
                System.out.println(" " + innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));
            }
        }
    }
}
