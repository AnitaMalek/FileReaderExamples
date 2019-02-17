package sda;

public class Books {

    private int ID;
    private String cat;
    private String name;
    private double price;
    private boolean inStock;
    private String author;
    private String series;
    private String sequence;
    private String genre;

    public Books (int ID, String cat, String name, double price, boolean inStock, String author,String series,
                  String sequence, String genre) {
        this.ID = ID;
        this.cat = cat;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.author = author;
        this.series = series;
        this.sequence = sequence;
        this.genre = genre;
    }


    public int getID() {
        return ID;
    }

    public String getCat() {
        return cat;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String getAuthor() {
        return author;
    }

    public String getSequence() {
        return sequence;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ID=" + ID +
                ", cat='" + cat + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", author='" + author + '\'' +
                ", series='" + series + '\'' +
                ", sequence='" + sequence + '\'' +
                ", genre=" + genre +
                '}';
    }
}
