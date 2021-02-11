package A02A03StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String exp = scan.nextLine();

        ArrayDeque<Integer> elements = new ArrayDeque<>();

        for(int i = 0; i < exp.length(); i++) {
            char openBracket = exp.charAt(i);

            if ('(' == openBracket) {
                elements.push(i);
            } else if (')' == openBracket) {
                System.out.println(exp.substring(elements.pop(), i + 1));
            }
        }
    }
}
