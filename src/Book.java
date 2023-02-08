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


    @Override
    public String toString() {
        return "Название книги: " + bookTitle + ", год издания: " + theYearOfPublishing +
                ", автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return theYearOfPublishing == book.theYearOfPublishing && this.bookTitle.equals(book.getBookTitle())
                && this.author.equals(book.getAuthor());

    }

    @Override
    public int hashCode() {
        String w = this.bookTitle + this.theYearOfPublishing + this.author + "qwerty"; // добавил "соль" для уменьшения шансов коллизии
        return  w.hashCode();
    }
}