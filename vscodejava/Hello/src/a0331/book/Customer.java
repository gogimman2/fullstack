package a0331.book;

import java.util.Map;

public class Customer {
    private int orderNum;
    private int money;  // 고객의 잔액
    private Map<String, Integer> foodOrder;  // 주문한 책과 수량

    public Customer(int orderNum) {
        this.orderNum = orderNum;
        this.money = 30000;  // 초기 금액 30,000원
    }

    public Map<String, Integer> getBookOrder() {
        return foodOrder;
    }

    public void setBookOrder(Map<String, Integer> bookOrder) {
        this.foodOrder = bookOrder;
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

    public String getOrderName() {
        return "고객 " + orderNum;
    }

    public Map<String getFoodOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFoodOrder'");
    }
}
