package a0410.market;

import java.util.Map;

public class Customer {
    private int orderNum;
    private int money;
    
    private Map<String, Integer> marketOrder;
    
    public Customer(int orderNum) {
        this.orderNum = orderNum;
        this.money = 0;
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public Map<String, Integer> getMarketOrder() {
        return marketOrder;
    }
    public void setMarketOrder(Map<String, Integer> marketOrder) {
        this.marketOrder = marketOrder;
    }

    public String getOrderName(){
        return "고객" + orderNum;
    }
}
