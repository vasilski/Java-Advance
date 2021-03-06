package A14GenericsLab.E02GenerixBoxInteger;

public class Box<E> {
    private E date;

    public Box(E date) {
        this.date = date;
    }

    @Override
    public String  toString() {
        return this.date.getClass().getName() + ": " + this.date;
    }
}
