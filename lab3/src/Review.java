public class Review {
    private String username;
    private int rating;
    private String comments;

    public Review(String username, int rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() { return rating; }
}
