import java.util.List;

  public class Music extends Media{

      private String artist;
      public Music(String title, String auteur, String ISBN, double price, String artist) {
          super(title, auteur, ISBN, price);
          this.artist = artist;
      }

      public void listen(User user) {
          user.addToPurchasedList(this);
      }

      public List<Music> generatePlaylist(List<Music> musicCatalog) {
          return musicCatalog.stream()
                  .filter(music -> music.getAuteur().equals(this.getAuteur()) && music != this)
                  .toList();
      }

      @Override
      public String getMediaType() {
          return getPrice() >= 10 ? "Premium Music" : "Music";
      }

      @Override
      public String toString() {
          return super.toString() + ", Artist: " + artist;
      }
  }






