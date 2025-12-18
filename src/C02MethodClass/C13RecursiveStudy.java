package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

// 재귀함수 활용 대표적인 알고리즘 예시 : 백트래킹, dfs 알고리즘에서 주로 사용.(또는 분할 정복)
// 대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기
public class C13RecursiveStudy {
    public static void main(String[] args) {
//        for문의 개수를 동적으로 결정하기 위해

//        0. for문의 개수 동적으로 결정
        recurFor(0, 3);

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

////        1. 조합
//        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(2, 0, myList, doubleList, new ArrayList<>());
//        System.out.println(doubleList);

////        2. 순열
//        List<List<Integer>> doubleList = new ArrayList<>();
//        permu(2, myList, doubleList, new ArrayList<>(), new boolean[myList.size()]);
//        System.out.println(doubleList);
    }

//    1. 조합
    public static void combi(int n, int start, List<Integer> myList, List<List<Integer>> doubleList, List<Integer> temp){
        if(temp.size() == n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(n, i+1, myList, doubleList, temp);
            temp.remove(temp.size()-1);
        }
    }

//    2. 순열
    public static void permu(int n, List<Integer> myList, List<List<Integer>> doubleList, List<Integer> temp, boolean[] visited){
        if(temp.size() == n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(visited[i]) continue;
            temp.add(myList.get(i));
            visited[i] = true;
            permu(n, myList, doubleList, temp, visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }

//    0. for문의 개수 동적
    public static void recurFor(int start, int end){
        if(start >= end) {
//            System.out.println("hello world"); // 27 (leaf 노드들만)
            return;
        }
        for(int i=0; i<end; i++){
            System.out.println("hello world"); // 3 + 9 + 27
            recurFor(start+1, end);
        }
    }

//    백준 : 15649(N과M), 6603(로또)

}
