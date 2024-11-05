import java.util.ArrayList;
import java.util.List;
public class Book extends Media {

    private int quantityInStock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int quantityInStock) {
        super(title, auteur, ISBN, price);
        this.quantityInStock = quantityInStock;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) return 0;
        double sum = 0;
        for (Review review : reviews) sum += review.getRating();
        return sum / reviews.size();
    }

    public void purchase(User user) {
        if (quantityInStock > 0) {
            user.addToPurchasedList(this);
            quantityInStock--;
        } else {
            System.out.println("Out of stock!");
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        quantityInStock += quantity;
        System.out.println(quantity + " items restocked. Current stock: " + quantityInStock);
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + quantityInStock + ", Media Type: " + getMediaType();
    }
}



