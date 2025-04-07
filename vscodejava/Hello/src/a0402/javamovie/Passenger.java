package a0402.javamovie;

public class Passenger {
    private String name;
    private int birthDate;
    private String pw;
    private String seat;
    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
