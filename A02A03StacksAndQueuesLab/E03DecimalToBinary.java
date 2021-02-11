package A02A03StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int decimal = Integer.parseInt(scan.nextLine());

        if (decimal == 0){
            System.out.print("0");
        }
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }
        for(Integer num : stack ) {
            System.out.print(num);
        }
    }
}
