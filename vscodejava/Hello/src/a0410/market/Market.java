package a0410.market;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Market {
    public static Market instance;
    public ArrayList<String> marketList;
    public ArrayList<Integer> marketPrice;
    public Map<String, Integer> menu;

    private Market() {
        marketList = new ArrayList<>();
        marketPrice = new ArrayList<>();
        menu = new LinkedHashMap<>();

        marketList.add("사과");
        marketList.add("오렌지");
        marketList.add("레몬");
        marketList.add("바나나");
        marketList.add("포도");
        marketList.add("토마토");
        marketList.add("메뉴판 다시보기");

        marketPrice.add(3000);
        marketPrice.add(4000);
        marketPrice.add(2000);
        marketPrice.add(5000);
        marketPrice.add(3500);
        marketPrice.add(4500);
        marketPrice.add(0);
    }

    public static Market getInstance(){
        if (instance == null) {
            instance = new Market();
        }
        return instance;
    }

    public void getMmenu(){
        menu.clear();
        for(int i = 0; i < marketList.size(); i++){
            menu.put(marketList.get(i), marketPrice.get(i));
        }

        DecimalFormat f = new DecimalFormat("0,000원");
        System.out.println("\n\n+----------------메뉴판-----------------+");
        System.out.println("|   Menu                         Price  |");
        int s = 1;
        for (Entry<String, Integer> get : menu.entrySet()) {
            System.out.printf("[%d] %-20s\t %s\n", s++, get.getKey(), f.format(get.getValue()));
        }
        System.out.println("+---------------------------------------+");
    }
}