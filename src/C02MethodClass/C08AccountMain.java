package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체 생성)
        Account a1 = new Account("hong1", "12345", 100000);
        Account a2 = new Account("hong2", "54321", 50000);
//        List를 계좌 객체를 담는 자료구조로 사용
        List<Account> myList = new ArrayList<>();
        myList.add(a1);
        myList.add(a2);

//        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고 변경 메서드 필요
//        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
        String myAccount = "12345";
        String destAcount = "54321";
        long money = 50000;
        for(Account a : myList){
            if(a.getAccountNumber().equals(myAccount)) a.setBalance(a.getBalance() - money);
            if(a.getAccountNumber().equals(destAcount)) a.setBalance(a.getBalance() + money);
        }

        System.out.println(myList);
    }
}

// Account클래스 - 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-long)
class Account{
    private String name;
    private String accountNumber;
    private long balance;

    public Account(String name, String accountNumber, long balance) {
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
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}