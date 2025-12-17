package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C03Class {
    public static void main(String[] args) {
////        클래스 메서드의 기본 호출 방식
//        int result = Calculator.sum(10, 20);
//        System.out.println(result);

////        객체가 아닌 클래스사용의 문제점 : 고유의 변수, 고유의 메서드 사용 불가
////        A부서의 매출
////        20원 매출 발생
//        Calculator.sumAcc(20);
//        System.out.println(Calculator.total);
////        30원 매출 발생
//        Calculator.sumAcc(30);
//        System.out.println(Calculator.total);
////        40원 매출 발생
////        누적매출 : 90원
//        System.out.println(Calculator.sumAcc(40));
//
////        B부서의 매출
////        10원 매출 : 누적 10
//        System.out.println(Calculator.sumAcc(10)); // 100 -> 10이 되어야 함
////        20원 매출 : 누적 30
//        System.out.println(Calculator.sumAcc(20)); // 120 -> 30이 되어야 함

////        객체를 활용한 부서별 매출계산
////        객체 생성 방법 : 클래스명 객체명 = new 클래스명();
//        CalculatorForInstance calA = new CalculatorForInstance();
//        calA.sumAcc(20);
//        calA.sumAcc(30);
//        calA.sumAcc(40);
//        System.out.println(calA.total);
//
//        CalculatorForInstance calB = new CalculatorForInstance();
//        calB.sumAcc(10);
//        calB.sumAcc(20);
//        System.out.println(calB.total);


//        클래스 메서드 사용 예시
        System.out.println(Math.min(10, 20));
//        객체 메서드 사용 예시
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);


    }
}
// 한 파일 내에 class가 여러개 있을 수 있다. 일반적이지 않다.
// 단 public class는 하나
class Calculator{
//    static이 붙어있으면 클래스 변수, 붙어있지 않으면 객체변수
    static int total = 0;
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sumAcc(int a){
        total += a;
        return total;
    }
}

class CalculatorForInstance{
    int total = 0;
//    메서드에 static이 있는 경우는 class 메서드
//    class 메서드는 일반적으로 객체의 상태와 상관 없는 독립적인 로직 수행 시에 사용
//    class 메서드 호출시 : 클래스명.메서드명();
    public static int sum(int a, int b){
        return a + b;
    }
//    메서드에 static이 없는 경우 객체 메서드
//    객체 메서드 호출시 : 객체명.메서드명();
    public int sumAcc(int total){
//        this는 객체를 지칭. 일반적으로, 매개변수와 객체변수 이름을 구분짓기 위해 사용
        this.total += total;
        return this.total;
    }
}