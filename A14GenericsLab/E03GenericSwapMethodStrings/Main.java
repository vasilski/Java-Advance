package A14GenericsLab.E03GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            boxes.add(new Box<>(reader.readLine()));
        }
        int[] index = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        swapElement(boxes, index[0], index[1]);

        for (Box box : boxes) {
            System.out.println(box);
        }
    }


    public static <E> void swapElement(List<E> list, int firstIndex, int secondIndex) {

        E firstElement = list.get(firstIndex);
        E secondElement = list.get(secondIndex);

        list.set(firstIndex, secondElement);
        list.set(secondIndex, firstElement);
    }
}
