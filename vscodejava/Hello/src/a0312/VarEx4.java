package a0312;

public class VarEx4 {
    public static void main(String[] args) {
        String item = "라면";
        int price =  800;
        double weight = 0.12;
        boolean discounted = false;
        // System.out.print("상품-");
        // System.out.print(item );
        // System.out.print(" ");
        // System.out.print("가격-");
        // System.out.print(price);
        // System.out.print("원 ");
        // System.out.print("무게-");
        // System.out.print(weight);
        // System.out.print("kg ");
        // System.out.print("할인여부-");
        // System.out.print(discounted);
        System.out.printf(
            "상품-%s 가격-%d원 무게-%.2fkg 할인여부-%b",
            item, price, weight, discounted
        );
    }
}
