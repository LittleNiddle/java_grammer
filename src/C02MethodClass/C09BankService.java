package C02MethodClass;

/*
<계좌개설 및 입출금 서비스>
1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요.
    3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
    3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
    3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
    3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
    3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
4.주의사항
    4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
    4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C09BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, BankAccount> accountMap = new HashMap<>();

        while(true){
            System.out.println("사용하실 서비스 번호를 입력해주세요.");
            System.out.println("    1: 계좌개설\n    2: 계좌조회\n    3: 입금\n    4: 출금\n    5: 송금");
            String str = br.readLine();

            int number;
            if(str.matches("^[1-5]$"))
                number = Integer.parseInt(str);
            else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            if(number == 1){ // 계좌 개설
                System.out.println("\"이름\"과 사용하실 \"계좌번호\"와 현재 \"가지고있는돈\"을 입력하세요.");
                String[] input = br.readLine().split(" "); // input[0] = 이름, input[1] = 계좌번호, input[2] = 가지고 있는 돈

                if(input.length != 3) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                if(accountMap.containsKey(input[1])) {
                    System.out.println("계좌번호가 중복입니다.");
                } else{
                    accountMap.put(input[1], new BankAccount(input[0], input[1], Long.parseLong(input[2])));
                }

            } else if(number == 2){ // 계좌 조회
                System.out.println("계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요.");
                String input = br.readLine();
                if(!accountMap.containsKey(input)) System.out.println("없는 계좌번호 입니다.");
                else System.out.println(accountMap.get(input));

            } else if(number == 3){
                System.out.println("계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요.");
                String[] input = br.readLine().split(" "); // input[0] = 계좌번호, input[1] = 입금금액

                if(input.length != 2) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                BankAccount a = accountMap.get(input[0]);
                Long money = Long.parseLong(input[1]);
                System.out.println("입금 전 잔액 : " + a.getBalance()); // 입금 전 잔액
                a.deposit(money);
                System.out.println("입금 후 잔액 : " + a.getBalance()); // 입금 후 잔액

            } else if(number == 4){
                System.out.println("계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요.");
                String[] input = br.readLine().split(" "); // input[0] = 계좌번호, input[1] = 출금금액
                if(input.length != 2) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                BankAccount a = accountMap.get(input[0]);
                long money = Long.parseLong(input[1]);
                if(a.withdraw(money)){
                    System.out.println("출금 후 남은 금액은 " + a.getBalance() + "입니다");
                } else {
                    System.out.println("잔액이 부족합니다");
                }
            } else if(number == 5) {
                System.out.println("송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요.");
                String[] input = br.readLine().split(" "); // input[0] = 본인 계좌번호, input[1] = 상대 계좌번호, input[2] = 송금금액

                if(input.length != 3) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                BankAccount a = accountMap.get(input[0]);
                BankAccount b = accountMap.get(input[1]);
                Long money = Long.parseLong(input[2]);

                if(a.transfer(b, money)){
                    System.out.println("송금 후 남은 금액은 "+ a.getBalance() +"입니다");
                } else {
                    System.out.println("잔액이 부족합니다");
                }
            }
        }
    }
}

class BankAccount{
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;

    public BankAccount(String name, String accountNumber, long balance) {
        staticId ++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean checkBalance(long money){
        return this.balance < money;
    }

    public boolean deposit(long money){
        this.balance += money;
        return true;
    }

    public boolean withdraw(long money){
        if(this.balance < money) return false;
        this.balance -= money;
        return true;
    }

    public boolean transfer(BankAccount targetAccount, long money){
        if(this.balance < money) return false;
        this.balance -= money;
        targetAccount.setBalance(targetAccount.getBalance() + money);
        return true;
    }
}
