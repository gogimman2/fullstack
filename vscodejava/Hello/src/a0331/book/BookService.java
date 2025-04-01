package a0331.book;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookService {
    private boolean reOrder = false;
    private int orderNum = 1;
    Map<String, Integer> orderList;

    public BookService(){
        orderList = new LinkedHashMap<>();
    }

    Book book = Book.getInstance();
    Customer customer;
    Thread t = new Thread();
    Scanner sc = new Scanner(System.in);

    public void start(){
        System.out.println("\n어서오세요 더 조은 서점입니다.");
        customer = new Customer(orderNum);
        book.getMenu();
        order();
        try {
            System.out.println("기다려 주시면 주문하신 책이 나옵니다.");
            t.sleep(2000);
            end();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void end() {
        int s = 1;
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
        .append("+----------------------------------------------------+\n ")
        .append("|                                                    | \n ")
        .append("|           " + customer.getOrderName() + " 고객님 주문하신 도서 나왔습니다         | " + "\n");
        System.out.print(message);
        for (Map.Entry<String, Integer> order : customer.getBookOrder().entrySet()) {
        System.out.printf(" | [%d] %-20s : %2d권  %7s |\n", s, order.getKey(), order.getValue(), "");
        s++;
    }
    System.out.println(" |                                                    |");
    System.out.println(" +----------------------------------------------------+");

    }

    private void order() {
        System.out.println("\n취소를 원하시면 0번을 눌러주세요");
        end : while (true) {
            try {
                System.out.println("\n원하시는 도서의 번호를 선택해주세요");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));
                if (choiceNum == 0) {
                    System.out.println("주문을 취소합니다.");
                    System.exit(0);
                }
                sc.nextLine();
                String bookName = book.bookList.get(choiceNum - 1);
                System.out.println("선택하신 도서는 : " + bookName + "입니다. 몇 권 주문하시겠습니까?");
                int orderCount = sc.nextInt();
                sc.nextLine();

                if (reOrder) {
                    for(String b : orderList.keySet()){
                        if (b.equals(bookName)) {
                            int addCount = orderList.get(b).intValue() + orderCount;
                            orderList.replace(bookName, addCount);
                        }
                        else{
                            orderList.put(bookName, orderCount);
                            break;
                        }
                    }
                }
                else{
                    orderList.put(bookName, orderCount);
                }

                addOrder();
                customer.setBookOrder(orderList);
                break end;
            } catch (Exception e) {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void addOrder() {
        Scanner sc = new Scanner(System.in);
        reOrder = false;
        System.out.println("\n주문을 계속 하시겠습니까?");
        System.out.println("예(Y) / 아니오(N)");
        String yesOrno = sc.next();
        if (yesOrno.equals("예") || yesOrno.equalsIgnoreCase("y")) {
            book.getMenu();
            reOrder = true;
            order();
        }
        else if (yesOrno.equals("아니오") || yesOrno.equalsIgnoreCase("n")) {
            return;
        }
    }

    private void totalOrder(Customer customer){
        int s = 1;
        int totalMoney = 0;
        int bookPrice = 0;
        DecimalFormat f = new DecimalFormat("###, 000");
        String name = customer.getOrderName() + "번";
        StringBuffer message = new StringBuffer();
        message.append("\n\n")
        .append("+----------------------------------------------------+\n ")
        .append("|                                                    | \n ")
        .append("|             " + name + "고객님 의 주문 내역 입니다         | " + "\n");
        for(Map.Entry<String, Integer> order : customer.getBookOrder().entrySet()){
            bookPrice = book.menu.get(order.getKey());
            String bookName = order.getKey();
            int orderCount = order.getValue();
            int bookUnitPrice = book.menu.get(bookName);
            bookPrice = bookUnitPrice * orderCount;
            totalMoney = totalMoney + bookPrice;
            String pay = f.format(bookPrice);
            message.append(String.format(" | [%d] %-20s : %2d권  %7s |\n", s, bookName, orderCount, pay));
            s++;
        }
        message.append(" |                                                    |\n ")
        .append("+----------------------------------------------------+ \n")
        .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
        System.out.println(message);
        payment(totalMoney);
    }

    private void payment(int totalMoney) {
        System.out.println("결제를 도와 드리겠습니다. 카드를 넣어주세요.");
        int payResult = customer.getMoney() - totalMoney;
        try {
            t.sleep(2500);
            System.out.println("결제중입니다.......");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (payResult < 0) {
            System.out.println("잔액이 부족합니다, 확인 후 다시 주문해주세요.");
        }
        else{
            customer.setMoney(payResult);
            System.out.println("결제가 완료 되었습니다.");
            System.out.println("이용해주셔서 감사합니다.");
            orderNum++;
        }
    }
}
