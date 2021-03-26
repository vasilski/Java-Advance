package A11DefiningClassesd.E02Constructors;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n -- > 0) {
            String[] input = scan.nextLine().split(" ");

            String brand = input[0];
            Car car;

            if (input.length == 3) {
                car = new Car(brand, input[1], Integer.parseInt(input[2]));
            } else if (input.length == 2) {
                car = new Car(brand, input[1]);
            } else {
                car = new Car(brand);
            }


            cars.add(car);

        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
