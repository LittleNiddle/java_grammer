package C01Basic;

import java.util.*;

public class C10List {
    public static void main(String[] args) {
////        List 선언방법 1.
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List 선언방법 2. - 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅 방법 1. 개별 data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//        System.out.println(myList3);
//
////        초기값 세팅 방법 2.
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
////        List의 출력
////        List등의 컬렉션프레임워크 안에는 toString메서드가 구현되어 있고, 자동 호출된다.
//        System.out.println(myList4);
//
////        List의 안의 자료 타입으로는 기본형 타입은 쓸 수 없음.
//        int[] intArr = {10, 20, 30};
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr){
//            myList5.add(i);
//        }

////        add : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); // list는 중간 위치에 데이터 삽입/삭제하는 작업은 비효율적이다.(인덱스가 뒤로 밀린다.)
//        // 방대한 양의 데이터에서는 비 효율적이나, 데이터의 양이 적을 때는 알고 주의해서 사용해라.
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(2));
//
////        size(): 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//
////        리스트의 값 출력 방법 1. 일반 for문
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
////        리스트의 값 출력 방법 2. 향상된 for문
//        for(int num : myList){
//            System.out.println(num);
//        }

////        remove : 값 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        myList.remove(0);
////        object로 삭제는 1) 값이 중복될 경우, 2) 탐색과정 필요

////        indexOf : 특정 값을 찾아 index return해준다.(가장 먼저 나오는 값)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));

////        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList.contains(20));

////        정렬 : 방법2가지(Collections클래스의 sort 메서드 사용, 객체의 sort 메서드 사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        // class method
//        Collections.sort(myList); // 오름차순
//        Collections.sort(myList, Comparator.reverseOrder()); // 내림차순
//
//        // 객체 method : 일관성이 있다.
//        myList.sort(Comparator.naturalOrder()); // 오름차순
//        myList.sort(Comparator.reverseOrder()); // 내림차순

////        이중리스트 : 리스트 안의 리스트
////        [[1,2,3],[4,5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> m1 = new ArrayList<>();
//        myList.add(m1);
//        myList.add(new ArrayList<>());
//        m1.add(1);
//        m1.add(2);
//        m1.add(3);
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
//        System.out.println(myList);

////        [[1,2,3],[4,5,6],...,[58.59.60]]
//        List<List<Integer>> list = new ArrayList<>();
//        int num = 1;
//        for(int i=0; i<20; i++){
//            list.add(new ArrayList<>());
//            for(int j=0; j<3; j++){
//                list.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(list);

//        리스트 안의 배열
//        [{10,20}, {1,2,3}, {4,3,2,1}]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{10, 20});
        myList.add(new int[]{1,2,3});
        myList.add(new int[]{4,3,2,1});
        System.out.println(Arrays.deepToString(myList.toArray()));

//        방법1.
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        myList.add(arr);
//        방법2.
        myList.add(new int[3]);
        myList.get(1)[0] = 1;
        myList.get(1)[1] = 2;
        myList.get(1)[2] = 3;
//        방법3.
        myList.add(new int[]{4,3,2,1});
        System.out.println(myList); // 배열 주소값이 출력. [x1배열 주소, x2배열 주소, x3배열 주소]
//        출력 :
        for(int i=0; i<myList.size(); i++){
            System.out.println(Arrays.toString(myList.get(i)));
        }

    }
}
