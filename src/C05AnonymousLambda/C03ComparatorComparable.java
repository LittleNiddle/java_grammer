package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
////        java에서는 비교를 위한 인터페이스 대표적으로 2개 제공
////        1. Comparator 인터페이스 : 인터페이스 내 compare 메서드만 존재
////        2. Comparable 인터페이스 : 인터페이스 내 compareTo 메서드만 존재
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구.
//        myList.sort(Comparator.naturalOrder());
////        o1과 o2의 숫자값을 마이너스 형식으로 코딩을 하되,
////        o1이 먼저 있으면 오름차순, o2가 먼저 있으면 내림차순
//        myList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 오름차순
////                return o2-o1; // 내림차순
//            }
//        });
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("c++");
////        기본적인 문자열 정렬일 때에는 Comparator커스텀을 하지 않고,
////        복잡한 자신만의 정렬 기준을 가지고 정렬해야 할 때 Comparator 익명객체 생성.
//        Collections.sort(myList2, (o1, o2) -> o1.length()-o2.length());
//        System.out.println(myList2);
//
////        ex) 문자열의 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳 순으로 정렬
//        Collections.sort(myList2, (o1, o2) -> {
//            if(o1.length() == o2.length()) return o1.compareTo(o2);
//            else return o1.length()-o2.length();
//        });
//
////    백준 단어정렬
//
////        배열, 리스트 정렬 외에 java의 그 외 정렬 자료구조
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
//        Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length()-o2.length());
//
////        백준 : 절대값 힙
////        백준 : 선 긋기
//
////        리스트 안의 배열 정렬
////        [{4,5},{1,2},{5,0},{3,1}]
////        리스트 안의 배열에 1번째 index를 기준으로 오름차순 정렬
//
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{4, 5});
//        list.add(new int[]{1, 2});
//        list.add(new int[]{5, 0});
//        list.add(new int[]{3, 1});
//
//        list.sort((o1, o2)->o1[1] - o2[1]);
//        for(int[] l : list){
////            System.out.println(l[0]+ " " + l[1]);
//            System.out.println(Arrays.toString(l));
//        }

//        직접 만든 객체 정렬 ***
//        방법 1. Comparator를 구현한 익명객체 방식
        List<Student> students = new ArrayList<>();
        students.add(new Student("h1", 50));
        students.add(new Student("h2", 40));
        students.add(new Student("h3", 30));
        students.add(new Student("h4", 20));
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(students);

//        방법2. Comparable을 구현한 방식 - 읽을줄만 알면 된다.
//        Student 객체 안에 Comparable을 implements 하는 방식
//        sort 실행시 자동으로 Student 안의 compareTo 메서드 호출
        Collections.sort(students);
//        한 클래스에는 하나의 compareTo 메서드만 존재한다.
    }
}
class Student implements Comparable<Student>{
// class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
//    this가 앞에 있으면 오르차순, 매개변수 객체가 앞에 있으면 내림차순
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
