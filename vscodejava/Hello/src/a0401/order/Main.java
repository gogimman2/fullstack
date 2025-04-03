package a0401.order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private final String name;
    private final String city;

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Order {
    private final int id;
    private final Customer customer;
    private final String product;
    private final int quantity;

    public Order(int id, Customer customer, String product, int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kim", "Seoul");
        Customer customer2 = new Customer("Lee", "Busan");
        Customer customer3 = new Customer("Park", "Seoul");
        Customer customer4 = new Customer("Choi", "Seoul");

        List<Order> orders = Arrays.asList(
                new Order(1, customer1, "Laptop", 1),
                new Order(2, customer2, "Smartphone", 2),
                new Order(3, customer3, "Keyboard", 1),
                new Order(4, customer1, "Mouse", 3),
                new Order(5, customer4, "Monitor", 1),
                new Order(6, customer3, "USB Cable", 2)
        );

        // 문제 1: 서울에 사는 고객의 주문만 출력하시오.
        // 문제 2: 모든 주문의 총 수량을 구하시오.(mapToInt사용)
        // 문제 3: 각 고객의 이름과 그 고객이 주문한 제품명을 출력하시오.
        // 문제 4: 특정 고객("Kim")의 주문만 필터링하여 출력하시오.
        // 문제 5: 주문 수량이 2개 이상인 주문만 출력하시오.
        // 문제 6: 고객이 주문한 제품의 종류를 중복 없이 출력하시오.
        // 문제 7. 모든 주문을 quantity 기준 내림차순으로 정렬하시오.
        // 문제 8.각 도시별로 고객 수를 출력하시오. (count이용)
        practice01(orders);
        practice02(orders);
        practice03(orders);
        practice04(orders);
        practice05(orders);
        practice06(orders);
        practice07(orders);
        practice08(orders);
    }

    // 문제 1: 서울에 사는 고객의 주문만 출력하시오.
    private static void practice01(List<Order> orders) {
        List<Order> result = 
        orders.stream()
              .map(Order :: getCustomer)
              .filter(order -> ("Seoul").equals(order.getCity()))
              .distinct()
              .sorted(Comparator.comparing(Order :: getProduct))
              .collect(Collectors.toList());
        System.out.println(result);
    }
}