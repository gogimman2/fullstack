package a0321.Account1;

public class AccountTest {
    public static void main(String[] args) {
        
        Account acc = new Account();
        //acc.balance = 1000;
        //System.out.printf("잔액: %d",acc.balance);
        acc.setBalance(1000); 
        System.out.printf("잔액: %d",acc.getBalance());   

    }
}
class Account{
    //자신외 모든 클래스의 접근을 거부한다.
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
  


}