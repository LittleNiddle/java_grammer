package C01Basic;

import java.util.regex.Pattern;

public class C08String {
    public static void main(String[] args) {
////        String 선언 방법 2가지
////        객체 선언 방식
////        st1과 st2는 힙메모리 주소가 다른 위치에 각각 생성되었기 때문에 다르다.
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
////        리터럴 방식 : String pool을 사용하는 방식(java에서 추천)
//        String st3 = "hello world";
//        String st4 = "hello world";
//        System.out.println(st1==st2); // false
//        System.out.println(st3==st4); // true - String Poll 사용 -> 스택 메모리의 두 값이 같은 힙 메모리의 주소를 참조한다.
//        System.out.println(st1==st3); // false
//
////        참조 자료형의 비료는 ==을 지양하고, equals method를 사용해라.
//        System.out.println(st1.equals(st3));

////        .equlas : heap 메모리의 문자열을 가져와서 equal 관계 비교
//        String st1 = "hello1";
//        String st2 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equalsIgnoreCase(st2));

////        .length : 문자열의 길이 출력
//        String st1 = "hello1 world1 java1";
//        System.out.println(st1.length());
//
////        .charAt(n) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(7);
//        System.out.println(ch1);
////        a의 개수가 몇 개인지 출력
//        int count = 0;
//        for(int i=-0; i<st1.length(); i++){
//            if(st1.charAt(i) == 'a') count++;
//        }
//        System.out.println(count);
//
////        .toCharArray: String문자열을 char 배열로 변환
//        for(char ch : st1.toCharArray()){
//            if(ch == 'a') count++;
//        }
//        System.out.println(count);

////        .indexOf(문자열) : 특정 문자열의 위치(index) 반환. 가장 먼저 나오는 문자열의 위치 반환.
////        .contains(문자열) : 특정 문자열을 가지고 있으면 true 반환. O(n)
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//        System.out.println(st1.lastIndexOf("java"));
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

////        문자열 더하기 : += 사용. 성능 측면에서는 추후 배울 StringBuffer, StringBuilder 사용
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '1'; // String에 char를 더하면 String으로 변환
//        System.out.println(st1);

////        .substring(a,b) : a이상, b미만의 index의 문자를 잘라 문자열로 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5)); // hello
//        System.out.println(st1.substring(6, st1.length())); // world

////        .trim, .strip : 문자열 양쪽 끝의 공백 제거 - 실전에서 사용됨
//        String st1 = " hello world  ";
//        String st2 = st1.trim();
//        String st3 = st1.strip();
//        System.out.println(st2);
//        System.out.println(st3);

////        .toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 소문자로 변환
//        String st1 = "Hello";
//        String st2 = st1.toUpperCase();
//        String st3 = st1.toLowerCase();
//        System.out.println(st2);
//        System.out.println(st3);

////        .replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

////        .replaceAll(a,b) : replace와 사용법 동일. 정규 표현식을 쓸 수 있다.
//        String st1 = "01abC123   한글123";
////        한글 제거 [가-힣]
//        String answer1 = st1.replaceAll("[가-힣]", "");
//        System.out.println(answer1);
////        알파벳 소문자 제거 [a-z]
//        String answer2 = st1.replaceAll("[a-z]", "");
//        System.out.println(answer2);
////        알파벳 제거
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer3);
////        공백 제거
//        String answer4 = st1.replaceAll(" ", "");
//        System.out.println(answer4);
//        String answer5 = st1.replaceAll("\\s+", "");
//        System.out.println(answer5);

////        전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        if(!check) System.out.println("형식이 잘못됐습니다. 다시 입력해주세요.");

////        이메일 검증
//        String email = "abc1234@naver.com";
//        boolean check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        if(!check) System.out.println("형식이 잘못됐습니다. 다시 입력해주세요.");

////        .split : 특정 문자를 기준으로 잘라서 문자 배열로 만드는 것.
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");
//        System.out.println(arr2.length); // 하나는 빈 문자역 "" 가 들어간다.

////        null과 공백의 차이
//        String st1 = null; // null은 문자열 아님
//        String st2 = ""; // 빈 문자열은 문자열
//        String st3 = " "; // 공백
//        System.out.println(st1 == st2); // false
//        System.out.println(st1.isEmpty()); // nullpointer exception 발생
//        System.out.println(st2.isEmpty()); // true
//        System.out.println(st3.isEmpty()); // false
//        System.out.println(st3.isBlank()); // true

////        공백의 개수 세기
//        String abc = "hello    world    java";
//        int total = 0;
//        for(int i=0; i<abc.length(); i++){
//            if(abc.substring(i, i+1).isBlank())
//                total++;
//        }
//        System.out.println(total);

////        문자열 조립 : StringBuffer, StringBuilder
//        String[] arr = {"java", "python", "javascript"};
//        StringBuffer sb = new StringBuffer();
//        for(int i=0; i<arr.length; i++){
//            sb.append(arr[i]);
//            sb.append(" "); // \n은 줄바꿈을 의미
//        }
//        sb.insert(0, "C++"); // 문자열 중간에 insert 하는 것은 성능 저하 발생.
//        sb.deleteCharAt(sb.length()-1); // 마지막 index를 삭제하는 것 외에는 성능 저하 발생.
//        String reulst = sb.toString();
//        System.out.println(reulst);

//        StringBuilder는 성능이 뛰어나지만, 동시성 문제 있음(Thread-Safe하지 않음)
//        Thread-Safe하려면 B를 막아야해서 성능이 떨어진다.
//        실전에서는 StringBuffer가 안전하다.
//        예를 들어) Thread A가 append("hello")를 하고 Thread B가 append(worlde);
//        두 작업이 중간에 섞여 helworldldo 이런 식으로 잘못된 값을 만들 수 있음.

////        문자열 뒤집기
//        StringBuilder sb2 = new StringBuilder();
//        String st1 = "hello";
//        for(int i=st1.length()-1; i>=0; i--){
//            sb2.append(st1.charAt(i));
//        }
//        System.out.println(sb2);
//
//        StringBuilder sb3 = new StringBuilder(st1);
//        sb3.reverse();
//        System.out.println(sb3);

//        문자열 비교 *
        String st1 = "hello";
        String st2 = "dello";
        String st3 = "hello";
        String st4 = "hfllo";

        System.out.println(st1.compareTo(st2)); // 양수
        System.out.println(st2.compareTo(st1)); // 음수
        System.out.println(st1.compareTo(st3)); // 0
        System.out.println(st4.compareTo(st3)); // 양수


    }
}
