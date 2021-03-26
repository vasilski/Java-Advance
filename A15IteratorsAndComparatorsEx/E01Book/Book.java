//package A15IteratorsAndComparatorsEx.E01Book;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Book{
//    private String title;
//    private int year;
//    private List<String> authors;
//
//    public Book(String title, int year, String... authors) {
//        this.setTitle(title);
//        this.setYear(year);
//        this.setAuthors(authors);
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public void setAuthors(String... authors) {
//        this.authors = Arrays.asList(authors);
//    }
//
//    @Override
//    public String toString() {
//        return "Book " +
//                title +
//                ", year " + year +
//                ", authors " + authors;
//    }
//}
