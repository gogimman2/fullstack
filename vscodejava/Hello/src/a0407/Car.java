package a0407;

public class Car {
    private String carNumber;
    private int inTime;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    public Car(String carNumber, int inTime) {
        this.carNumber = carNumber;
        this.inTime = inTime;
    }
}
