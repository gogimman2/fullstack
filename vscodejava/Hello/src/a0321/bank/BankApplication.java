package a0321.bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    //모든 계좌정보를 저장 - 하나의 배열에 저장하므로 새로운배열을 만들 필요가 없어 static 을 쓴다.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while(run){
            System.out.println("------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금  | 5.이체 | 6.종료");
            System.out.println("-------------------------------------------------------");
            System.out.print("선택>");
            int selectNo = Integer.parseInt(scanner.nextLine());
            if(selectNo == 1){
                createAccount();
                }else if(selectNo == 2){
                 accountList();   
                }else if(selectNo == 3){
                  deposit();     //예금 
                }else if(selectNo == 4){
                  withdraw();  //출금  
                }else if(selectNo == 5){
                    transferMoney();  //출금  
                  }else if(selectNo == 6){
                        run = false;   
                }
        
            }
                System.out.println("프로그램 종료");
        
     }       
        
           
    
          private static void createAccount() {
           System.out.println("------------");
           System.out.println(" 계좌생성 ");
           System.out.println("------------");
           System.out.print("계좌번호:");
           String ano = scanner.nextLine(); 
           System.out.print("계좌주:");
           String owner = scanner.nextLine(); 
           System.out.print("초기입금액:");
           int balance = Integer.parseInt(scanner.nextLine());

           Account newAccount = new Account(ano, owner, balance); //키보드로 입력된값을 생성자로 초기화
           for(int i=0; i < accountArray.length;i++){
               if(accountArray[i]==null){
                 accountArray[i] = newAccount;
                 System.out.println("결과 : 계좌가 생성되었습니다.");
                 break;
               } 
           }
            //accountArray[0] = newAccount("110-110","gildong",10000)
           // accountArray[1]  = newAccount("110-111","sunja",20000)

        }

        private static void accountList() {
            System.out.println("------------");
            System.out.println(" 계좌조회 ");
            System.out.println("------------");
            for(int i=0; i < accountArray.length;i++){
                Account account = accountArray[i];
                if(account != null){
                    System.out.print(account.getAno());
                    System.out.print("     ");
                    System.out.print(account.getOwner());
                    System.out.print("     ");
                    System.out.print(account.getBalance());
                    System.out.println();
                }
            }
        }

        private static void deposit(){
            System.out.println("------------");
            System.out.println(" 에금 ");
            System.out.println("------------");
            System.out.print("계좌번호: ");
            String ano = scanner.nextLine();
            System.out.print("예금액: ");
            int money = Integer.parseInt(scanner.nextLine());
            Account account = findAccount(ano);
            if(account == null){
                System.out.println("결과 : 계좌가 없습니다.");
                return;
            }
            account.setBalance(account.getBalance() + money);
            //현재의 잔액을 gatter로 불러와서 예금액(money)를 더한후
            //setBalance로 더한 금액을 넣기
            
            } 
    
            private static void withdraw(){
                System.out.println("------------");
                System.out.println(" 출금 ");
                System.out.println("------------");
                System.out.print("계좌번호: ");
                String ano = scanner.nextLine();
                System.out.print("출금액: ");
                int money = Integer.parseInt(scanner.nextLine());
                Account account = findAccount(ano);
                if(account == null){
                    System.out.println("결과 : 계좌가 없습니다.");
                    return;
                }
                account.setBalance(account.getBalance() - money);
                //현재의 잔액을 gatter로 불러와서 예금액(money)를 더한후
                //setBalance로 더한 금액을 넣기
                
                } 
        
    // 이체
    private static void transferMoney() {
        System.out.println("------------");
        System.out.println("이체");
        System.out.println("------------");
        System.out.print("출금 계좌 번호: ");
        String sourceAccountNumber = scanner.nextLine();
        System.out.print("입금 계좌 번호: ");
        String targetAccountNumber = scanner.nextLine();
        System.out.print("이체액: ");
        int amount = Integer.parseInt(scanner.nextLine());

        Account sourceAccount = findAccount(sourceAccountNumber); // 출금 계좌 찾기
        Account targetAccount = findAccount(targetAccountNumber); // 입금 계좌 찾기

        if(sourceAccount != null && targetAccount != null) {
            if(sourceAccount.getBalance() >= amount) {
                sourceAccount.setBalance(sourceAccount.getBalance() - amount); // 출금 계좌에서 금액 차감
                targetAccount.setBalance(targetAccount.getBalance() + amount); // 입금 계좌에 금액 추가
                System.out.println("이체가 성공적으로 완료되었습니다!");
            } else {
                System.out.println("출금 계좌에 잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }




            private static Account findAccount(String ano) {
               Account account = null;//비어있는 갯체를 만든다. (반환되는 내용을 담아갈 객체)
               for(int i = 0; i < accountArray.length;i++){
                   if(accountArray[i] !=null){ //accountArray[i] 배열의 내용이 있으면
                    String dbAno = accountArray[i].getAno(); // 배열의 계좌번호를 
                    if(dbAno.equals(ano)){
                       account = accountArray[i];
                       break;
                    }
                   }
               } 
               return account;
            }


}