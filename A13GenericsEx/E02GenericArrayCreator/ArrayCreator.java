package A13GenericsEx.E02GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item){
        return (T[]) Array.newInstance(item.getClass(), length );
    }

    public static <T> T[] create (Class<T> clazz, int length, T item) {
        return (T[]) Array.newInstance(clazz, length );
    }
}
