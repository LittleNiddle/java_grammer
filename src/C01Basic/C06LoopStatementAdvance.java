package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C06LoopStatementAdvance {
    int a = 10;
    public static void main(String[] args) {
////        1~20까지 수 중에 짝수의 총합 출력
//        int sum = 0;
//        for(int i=1; i<=20; i++){
//            if(i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

////        두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a>b?b:a; // Math.min(a,b);
//        int result = 0;
//        for(int i = min; i > 0; i--){
//            if(a % i == 0 && b % i == 0) {
//                result = i;
//                break;
//            }
//        }
//        System.out.println(result);

////        소수인지 여부 판별. 1보다 큰 수 중 1과 자기 자신을 제외한 숫자로 나누어지지 않는 수.
//        Scanner myScanner = new Scanner(System.in);
//        int num = Integer.parseInt(myScanner.nextLine());
//        boolean check = false;
//        for(int i = 2; i*i<=num; i++){
//            if(num%i == 0){
//                check = true;
//                break;
//            }
//        }
//        if(check || num == 1){
//            System.out.println("소수아님");
//        } else{
//            System.out.println("소수임");
//        }

////        일반 for문을 통한 배열 접근 방식
//        int[] arr = {1, 3, 5, 7};
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
////        향상된(enhanced for문, for each문) for문을 통한 배열 접근 방식
//        for(int a : arr){
//            System.out.println(a);
//        }

////        일반 for문을 통한 arr의 저장된 값 변경
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 10;
//        }
////        참조형 변수 객체 타입은 기본적으로 변수를 통한 출력시에 메모리 값이 출력된다.
////        그래서, 내장된 메서드를 통해 힙메모리 낭의 객체 값을 보기 좋게 출력할 수 있음
//        String abc = "hello world";
//        System.out.println(Arrays.toString(arr));
//
////        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
////        원본의 값을 바꾸는 것을 지양한다.
//        for (int a : arr) {
//            a+=10;
//        }

// 힙 메모리 : 참조형 변수들의 실제 값 저장
// 스택 메모리 : 지역변수, 매개변수, 기본형 자료, 객체의 주소값 등을 저장

////        자바 변수의 유효 범위 : {}
//        int num1 = 10;
//        if(true){
//            num1 = 20;
//            int num2 = 30;
//        }
////        하위 영역의 블록(중괄효)에서 정의된 변수는 상위 블록에서는 접근 불가
//        num2 = 40;

////        for문은 사용했던 변수 명을 for문이 끝난 이후에 또 다른 for문에서 재선언이 가능.
//        for(int i=0; i<10; i++){
//            System.out.println(i);
//        }
//        for(int i=0; i<10; i++){
//            System.out.println(i);
//        }

////        다중 for문
////        2~9단까지 모든 구구단 한꺼분에 출력
////        2단입니다.를 먼저 출력 후 2X1=2 2X2=4 ...
//        for(int i=2; i<10; i++){
//            System.out.println(i + "단입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i + "X" + j + "=" + i*j);
//            }
//        }

////        라벨문 : 반복문에 이름을 붙이는 것
//        loop1:
//        for(int i=0; i<10; i++){
//            for(int j=0; j<10; j++){
//                if(true){
////                    원하는 for문을 라벨링을 통해 break 또는 continue시킬 수 있음
//                    break loop1;
//                }
//            }
//        }
    }
}
