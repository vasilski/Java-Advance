//package A11DefiningClassesd.E01CarInfo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//
//        List<Car> cars = new ArrayList<>();
//
//        while (n -- > 0) {
//            String[] input = scan.nextLine().split(" ");
//            Car car = new Car();
//            car.setBrand(input[0]);
//            car.setModel(input[1]);
//            car.setHorsePower(Integer.parseInt(input[2]));
//
//            cars.add(car);
//
//        }
//
//        for (Car car : cars) {
//            System.out.println(car.carInfo());
//        }
//    }
//}
