package C02MethodClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 재귀함수 활용 대표적인 알고리즘 예시 : 백트래킹, dfs 알고리즘에서 주로 사용.(또는 분할 정복)
// 대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.println("hello world");
//            }
//        }
//        위 for문의 반복횟수(개수)는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재.
//        recurFor(0, 3);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> resultList = new ArrayList<>();
////        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자 조합을 이중 리스트에 담아 출력
//        for(int i=0; i<myList.size(); i++){
//            for(int j=i+1; j<myList.size(); j++){
//                List<Integer> in = new ArrayList<>();
//                in.add(myList.get(i));
//                in.add(myList.get(j));
//                resultList.add(in);
//            }
//        }
//        System.out.println(resultList);

//        재귀함수를 통한 조합
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                doubleList.add(new ArrayList<>(temp));
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(doubleList);

//        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(new ArrayList<>(), 0, myList, 2, doubleList); // 원본, 2개짜리 조합, 조합을 담을 이중 리스트
//        System.out.println(doubleList);

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

//        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        for(int i=0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            visited[i] = true;
//            for(int j=0; j<myList.size(); j++){
//                if(visited[j]) continue;
//                temp.add(myList.get(j));
//                visited[j] = true;
//                doubleList.add(new ArrayList<>(temp));
//                temp.remove(temp.size() - 1);
//                visited[j] = false;
//            }
//            temp.remove(temp.size() - 1);
//            visited[i] = false;
//        }
//        System.out.println(doubleList);


        List<List<Integer>> doubleList = new ArrayList<>();
        permu(new ArrayList<>(), myList, 2, doubleList, new boolean[myList.size()]);
        System.out.println(doubleList);

    }
    public static void combi(List<Integer> temp, int start, List<Integer> myList, int n, List<List<Integer>> doubleList){
        if(temp.size() == n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(temp, i+1, myList, n, doubleList); // ++start
            temp.remove(temp.size() - 1);
        }
    }

    public static void permu(List<Integer> temp, List<Integer> myList, int n, List<List<Integer>> doubleList, boolean[] visited){
        if(temp.size() == n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(visited[i]) {
                continue;
            } else {
                temp.add(myList.get(i));
                visited[i] = true;
            }
            permu(temp, myList, n, doubleList, visited);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }

//    private static void recurFor(int start, int end) {
//        if(start == end) {
//            System.out.println("hello world");
//            return;
//        }
//        for(int i=0; i < end; i++){
////            System.out.println("hello world"); 이렇게 실행하면 3^n 형식이 아님
//            recurFor(start+1, end);
//        }
//    }

//    백준 : 15649(N과M), 6603(로또)

}
