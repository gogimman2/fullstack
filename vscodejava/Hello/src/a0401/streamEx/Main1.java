package a0401.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Combridge");
        Trader brian = new Trader("Brian", "Combridge");
        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300)
            , new Transaction(raoul, 2012, 1000)
            , new Transaction(raoul, 2011, 400)
            , new Transaction(mario, 2012, 700)
            , new Transaction(mario, 2012, 700)        
            , new Transaction(alan, 2012, 950)
        );
        // brian, mario 등은 거래자, Combridge거래자가 근무하는 도시
        // 1. 2011년에 일어난 모든 트렌젝션을 찾아 오름차순으로 정렬하시오
        practice1(transactions);
        // 2. 거래자가 근무하는 모든 도시를 중복없이 정렬하시오
        practice2(transactions);
        // 3. Combridge 에서 근무하는 모든 거래자를 찾아 이름순으로 정렬하시오
        practice3(transactions);
        // 4. 밀라노엔 거래자가 있는가?
        practice4(transactions);
        // 5. 케임브브릿지에 거주하는 거래자의 모든 트렌젝션값으로 출력하시오
        practice5(transactions);
        // 6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        practice6(transactions);
        // 7. 최대값 구하시오
        practice7(transactions);
        // 8. 최소값을 구하시오
        practice8(transactions);
    }

    // 8. 최소값을 구하시오
    private static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result =
        transactions.stream()
                    .min(Comparator.comparing(Transaction :: getValue));
        System.out.println(result);  // null이어도 Optiona; 감싸서 반환
        System.out.println(result.get().getValue());
    }

    // 7. 최대값 구하시오
    private static void practice7(List<Transaction> transactions) {
        Transaction result =
        transactions.stream()
                    .max(Comparator.comparing(Transaction :: getValue))
                    .orElse(null);  // 값이 없으면 null 반환
        System.out.println(result);
    }

    // 6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
    private static void practice6(List<Transaction> transactions) {
        List<String> result = 
        transactions.stream()
                    .map(Transaction :: getTrader)
                    .map(Trader :: getName)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
                    System.out.println(result);
    }

    // 5. 케임브브릿지에 거주하는 거래자의 모든 트렌젝션값으로 출력하시오
    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = 
        transactions.stream()
                    .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
                    .collect(Collectors.toList());
                    System.out.println(result);
    }

    // 4. 밀라노엔 거래자가 있는가?
    private static void practice4(List<Transaction> transactions) {
        boolean result = 
        transactions.stream()
                    .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
        System.out.println(result);
    }

    // 3. Combridge 에서 근무하는 모든 거래자를 찾아 이름순으로 정렬하시오
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = 
        transactions.stream()
                    .map(Transaction :: getTrader)
                    .filter(trader -> ("Cambridge").equals(trader.getCity()))
                    .distinct()
                    .sorted(Comparator.comparing(Trader :: getName))
                    .collect(Collectors.toList());
        System.out.println(result);
    }

    // 2. 거래자가 근무하는 모든 도시를 중복없이 정렬하시오
    private static void practice2(List<Transaction> transactions) {
        List<String> result = 
        transactions.stream()
                    .map((tran) -> tran.getTrader().getCity())
                    .distinct()
                    .collect(Collectors.toList());
        //tran(transactions) 객체를 입력받아서 
        //.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
        //.map(Trader::getCity) //각 거래자에서 도시정보추출
        System.out.println(result);
    }

    // 1. 2011년에 일어난 모든 트렌젝션을 찾아 오름차순으로 정렬하시오
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result =
        transactions.stream()
                .filter(transaction -> 2011 == transaction.getYear())
                .sorted(Comparator.comparing(Transaction :: getValue))
                    // .sorted(Comparator.comparing(Transaction :: getValue).reserved()) 내림차순
                    // .sorted((tran1, tran2) -> Integer.compare(tran1.getValue(), tran2.getValue()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

// p.463 ★