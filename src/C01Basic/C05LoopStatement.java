package C01Basic;

import java.io.IOException;

public class C05LoopStatement {
    public static void main(String[] args) throws IOException {

////        while문의 조건식에 변화를 주지 않으면 while문은 기본적으로 무한루프
//        int a = 0;
//        while(a < 10){
//            System.out.println("Hello world");
//            a++;
//        }
////        while문을 활용하여 2~10까지 출력
//        int b=2;
//        while(b<=10){
//            System.out.println(b);
//            b++;
//        }

//        int c = 2;
//        while(true){
//            System.out.println(c);
//            c++;
////            break를 통해 가장 가까이에 있는 반복문을 즉시 종료
//            if(c > 10) break;
//        }

////        반복되는 도어락키 예제
////        만약 비밀번호를 맞추면 즉시 종료 -> 문이 열렸습니다.
////        5회 입력을 초과할 때까지 맞추지 못하면 종료 -> 비밀번호 5회 초과 출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String answer = "1234";
//        int count = 0;
//        while(true){
//            String input = br.readLine();
//
//            if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            count++;
//
//            if(count == 5) {
//                System.out.println("비밀번호 5회 초과");
//                break;
//            }
//        }

////        입력한 숫자의 구구단 단수 출력 ex)2를 입력 -> 2 X 1 = 2 2 X 2 = 4 ... 2 X 9 = 18
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while(true){
//            int input = Integer.parseInt(br.readLine());
//            int count=1;
//            while(count<10){
//                System.out.println(input+" X "+count+"= " + count*input);
//                count++;
//            }
//        }

////        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println("hello world");
//            a++;
//        }
//        while(a<10);

////        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        for(int i=0; i<10; i++){
//            System.out.println("hello world");
//        }

////        1~10 중에 홀수만 출력하기
//        for(int i=1; i<=10; i++){
//            if(i % 2 == 1)
//                System.out.println(i);
//        }

//        continue: 반복문의 증감, 조건식으로 이동하는 명령어. 즉, continue하위의 코드를 더이상 실행하지 않음.
        for(int i=1; i<=10; i++){
            if(i % 2 == 0) {
//                continue는 코드의 직관성과 가독성을 위해 사용
                continue;
            }
            else System.out.println(i);
        }



    }
}
