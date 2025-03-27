package a0326.coffee1;

import java.util.*;

public class CoffeeOrder {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();

        menu.put("Americano", 3000);
        menu.put("Latte", 4000);
        menu.put("Mocha", 4500);
        menu.put("Espresso", 2500);

        
        Map<String, Integer> order = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n메뉴 : ");
            for(Map.Entry<String, Integer> entry : menu.entrySet()){
                System.out.println(entry.getKey() + " - " + entry.getValue() + "원");
            }

            System.out.print("주문할 커피 이름(종료 : exit)");
            String coffee = scanner.nextLine();
            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }
            if (!menu.containsKey(coffee)) {
                System.out.println("해당커피는 메뉴에 없습니다. 다시 입력 바랍니다.");
                continue;
            }
        }
    }
}
