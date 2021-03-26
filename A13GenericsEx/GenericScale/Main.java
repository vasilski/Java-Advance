package A13GenericsEx.GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(13, 5);

        System.out.println(scale.getHeavier());
    }
}
