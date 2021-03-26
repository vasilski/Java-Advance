package A13GenericsEx.ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMax(List<T> collection) {
        return collection.stream().max(T::compareTo).orElse(null);
    }
    public static <T extends Comparable<T>> T getMin(List<T> collection) {
        return collection.stream().min(T::compareTo).orElse(null);
    }

    public static <T extends Comparable<T>> void sort(List<T> collection) {
        Collections.sort(collection);
    }
}
