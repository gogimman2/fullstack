package a0324.doseo1;

public class Library {
    private String titile; // 책제목
    private String author; // 책 저자
    private String location; // 책 위치
    private String isbn;
    private boolean available;

    public Library() { //기본생성자
    }
    public Library(String titile, String author, String location, String isbn) {
        this.titile = titile;
        this.author = author;
        this.location = location;
        this.isbn = isbn;
        this.available = true;
    }
    
    
    public String getTitile() {
        return titile;
    }
    public void setTitile(String titile) {
        this.titile = titile;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "책 제목 : " + titile + ", 저자 : " + author + ", 책 위치: " + location + ", ISBN :" + isbn
                + ", 대출여부: " + (available ? "대출 가능" : "대출 불가능") ;
    }

    //도서대출후 대출불가능 메서드 작성
    public void book(){
        this.available = false;
    }



}