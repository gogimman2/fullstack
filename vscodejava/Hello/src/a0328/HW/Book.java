package a0328.HW;

public class Book {
    private int id;
    private String title;
    private String name;
    private String ISBN;
    private int price;
    
    public Book(){}

    public Book(int id, String title, String name, String iSBN, int price) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.ISBN = iSBN;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "[제목 : " + title + ", 저자 : " + name + ", ISBN : " + ISBN + ", 가격 : " + price + "]";
    }
}
