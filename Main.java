public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Возмездие зомби", "Гранберг", 2004);
        Book book2 = new Book("Букварь", "Дорохов", 2003);
        Book book3 = new Book("Азбука", "Егоров", 2000);
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println("Вывод исходного массива книг:\n");
        library.booksPrint();

        System.out.println("Вывод исходного массива книг отсортированного по Автору:\n");
        library.books.sort(new AuthorComparator());
        library.booksPrint();

        System.out.println("Вывод исходного массива книг отсортированного по Названию:\n");
        library.books.sort(new TitleComparator());
        library.booksPrint();

        System.out.println("Вывод исходного массива книг отсортированного по Году издания:\n");
        library.books.sort(new PublichedYearComarator());
        library.booksPrint();
    }
}
