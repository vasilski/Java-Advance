package A12DefiningClassesExercises.E01OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        while (n -- > 0) {

            String[] tokens = scan.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            people.add(person);


        }

        people.stream().filter(person -> person.age > 30)
                .sorted(Comparator.comparing(person -> person.name))
                .forEach(System.out::println);
    }
}
