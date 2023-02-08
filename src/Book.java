public class Book {
    private String bookTitle;
    private Author author;
    private int theYearOfPublishing;

    public Book(String bookTitle, int theYearOfPublishing, Author author) {
        this.bookTitle = bookTitle;
        this.theYearOfPublishing = theYearOfPublishing;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println(
                "Название книги: " + getBookTitle() + ", год издания: " + getTheYearOfPublishing() +
                        ", автор: " + getAuthor().getName() + " " + getAuthor().getSurname()
        );
    }

}
