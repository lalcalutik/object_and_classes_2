public class Main {


    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");

        Book dubrovskiy = new Book("Дубровский", 1841, Pushkin);
        Book warAndPeace = new Book("Война и мир", 1867, Tolstoy);

        dubrovskiy.printInfo();
        warAndPeace.printInfo();

        dubrovskiy.setTheYearOfPublishing(1845);
        System.out.println();
        dubrovskiy.printInfo();
    }

}