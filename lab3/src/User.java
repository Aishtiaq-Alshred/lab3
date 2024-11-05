import java.util.ArrayList;
import java.util.List;
public class User {

    private String username;
    private String email;
    private List<Media> purchasedMedia;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }


    //set
    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //get

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            purchasedMedia.add(media);
        }
        shoppingCart.clear();
    }

    public void addToPurchasedList(Media media) {
        purchasedMedia.add(media);
    }
}

