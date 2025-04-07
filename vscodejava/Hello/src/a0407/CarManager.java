package a0407;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarManager {
    private static ArrayList<Car> cars;
    private static Map<String, Car> cc = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void parkCar(String number, int inTime) {
        System.out.print("차량 번호 입력 : ");
        String getCarNumber = sc.nextLine();
        System.out.print("입차 시간 입력 : ");
        int getInTime = sc.nextInt(); 
        System.out.println(getCarNumber + " 입차 완료.");
    }

    public void exitCar(String number, int outTime) {

    }

    public void showCars() {
        
    }
    
}
