// Part 2
    // 2.1
import java.util.Calendar;
public class Hobbies{
    private String Book;
    private int dateWhenPublished;
    private int authorBirth;
    private double bookRating;
    private int authorYearsOfLife;

    public void setDateWhenPublished(int dateWhenPublished){
        this.dateWhenPublished = dateWhenPublished;
    }

    public void setAuthorBirth(int authorBirth){
        this.authorBirth = authorBirth;
    }
    public void setBook(String Book){
        this.Book = Book;
    }
    public void setBookRating(double bookRating){
        this.bookRating = bookRating;
    }
    public void setAuthorYearsOfLife(int authorYearsOfLife){
        this.authorYearsOfLife = authorYearsOfLife;
    }
    public int getDateWhenPublished(){
        return dateWhenPublished;
    }
    public String getBook(){
        return Book;
    }
    public int getAuthorBirth(){
        return authorBirth;
    }
    public double getBookRating(){
        return bookRating;
    }
    public int getAuthorYearsOfLife(){
        return authorYearsOfLife;
    }
    // 2.2
    public Hobbies(String inBook, int inDateWhenPublished, int inAuthorBirth, double inBookRating, int inAuthorYearsOfLife){
        Book = inBook;
        dateWhenPublished = inDateWhenPublished;
        authorBirth = inAuthorBirth;
        bookRating = inBookRating;
        authorYearsOfLife = inAuthorYearsOfLife;
    }
    // 2.3
    public void printEverything(){
        System.out.println("The book's name is: " + Book + ".");
        System.out.println("The year when book was published is: " + dateWhenPublished + ".");
        System.out.println("The year of author's birth is: " + authorBirth + ".");
        System.out.println("The book's rating is: " + bookRating + ".");
        System.out.println("The author's years lived are: " + authorYearsOfLife + ".");
    }
    public void calculateYearsSincePublished(){
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(curYear - dateWhenPublished);
    }
    public void calculateYearsSinceAuthorBirth(){
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(curYear - authorBirth);
    }

    public static void main(String[] args) {
        Hobbies author1 = new Hobbies("Testbook1", 1983, 1945, 4.3, 91);
        Hobbies author2 = new Hobbies("Testbook2", 1992, 1939, 3.2, 64);
        Hobbies author3 = new Hobbies("Testbook3", 2001, 1989, 5.8, 34);
        author1.printEverything();
        System.out.println();
        System.out.println();
        System.out.println();
        author2.printEverything();
        System.out.println();
        System.out.println();
        System.out.println();
        author3.printEverything();
        System.out.println();
        System.out.println();
        System.out.println();
        author3.calculateYearsSinceAuthorBirth();
        System.out.println();
        System.out.println();
        System.out.println();
        author2.calculateYearsSincePublished();
    }
}
