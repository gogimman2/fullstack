package a0402.javamovie;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Movie {
    private String destination;
    private String time;
    private int price;
    private DecimalFormat priceFormat = new DecimalFormat("#, ###원");
    private Boolean internationalMovie;
    private ArrayList<String> seats;
    
    public Movie(String destination, String time, int price, boolean internationalMovie) {
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.internationalMovie = internationalMovie;
        seats = new ArrayList<>();
        for(int o = 1;o <= 20;o++){
            seats.add(o+"");
        }
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public DecimalFormat getPriceFormat() {
        return priceFormat;
    }
    public void setPriceFormat(DecimalFormat priceFormat) {
        this.priceFormat = priceFormat;
    }
    public Boolean getInternationalMovie() {
        return internationalMovie;
    }
    public void setInternationalMovie(Boolean internationalMovie) {
        this.internationalMovie = internationalMovie;
    }
    public ArrayList<String> getSeats() {
        return seats;
    }
    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }
    @Override
    public String toString() {
        String priceComma = priceFormat.format(price);
        return "영화제목 : " + destination + ", 상영 시작시간 : " + time + ", 가격 : " + priceComma;
    }

    public void seatToString(){
        for(int i = 0;i < seats.size() - 3;i += 4){
            System.out.printf("|   [%2s]    [%2s]\t[%2s]    [%2s]   |\n", seats.get(i), seats.get(i + 1), seats.get(i + 2), seats.get(i + 3));
        }
    }
}
