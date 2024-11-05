import java.util.List;

public class Movie extends Media {

    private int duration;
    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user) {
        user.addToPurchasedList(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        return movieCatalog.stream()
                .filter(movie -> movie.getAuteur().equals(this.getAuteur()) && movie != this)
                .toList();
    }

    @Override
    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " min";
    }
}




