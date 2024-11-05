//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Store store = new Store();



        Book book1 = new Book("نظرية الفستق", "فهد عامر الأحمدي", "024-999", 16.99, 8);
        AcademicBook academicBook1 = new AcademicBook("Java: The Complete Reference", "Herbert Schildt", "025-123", 39.99, 10, "Programming");


        Novel novel1 = new Novel("ساق البامبو", "سعود السنعوسي", "020-555", 14.99, 7, "دراما اجتماعية");
        Novel novel2 = new Novel("حوجن", "إبراهيم عباس", "023-888", 10.99, 4, "خيال علمي");


        Movie movie1 = new Movie("وجدة", "هيفاء المنصور", "016-111", 10.99, 98);
        Movie movie2 = new Movie("شمس المعارف", "فارس قدس", "018-333", 11.99, 119);


        Music music1 = new Music("زمان الصمت", "طلال مداح", "010-111", 8.99, "طلال مداح");
        Music music2 = new Music("تقوى الهجر", "خالد عبدالرحمن", "014-555", 7.99, "خالد عبدالرحمن");



        store.addMedia(book1);
        store.addMedia(novel1);
        store.addMedia(academicBook1);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);
        store.addMedia(music2);


        System.out.println("=== Available Media in Store ===");
        store.displayMedias();


        User user1 = new User("Aishtiaq", "Aishtiaq@gmail.com");
        User user2 = new User("Mona", "Mona@gmail.com");

        store.addUser(user1);
        store.addUser(user2);


        System.out.println("\n=== Registered Users ===");
        store.displayUsers();


        user1.addToCart(book1);
        user1.addToCart(novel1);


        System.out.println("\n=== User Checkout ===");
        user1.checkout();


        Review review1 = new Review("Aishtiaq", 5, "Excellent book on Java!");
        book1.addReview(review1);

        System.out.println("\n=== Book Details with Review ===");
        System.out.println(book1);
        System.out.println("Average Rating for book1: " + book1.getAverageRating());


        System.out.println("\n=== Testing Media Types ===");
        System.out.println(book1.getTitle() + " Type: " + book1.getMediaType());
        System.out.println(movie1.getTitle() + " Type: " + movie1.getMediaType());
        System.out.println(music2.getTitle() + " Type: " + music2.getMediaType());


        book1.restock(5);
    }
}