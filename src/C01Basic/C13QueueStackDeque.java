package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {
////        Queue 인터페이스를 Linkedlist를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll은 큐에서 가장 앞의 데이터를 삭제하는 동시에 return 하는 method
//        int value = myQue.poll();
//        System.out.println(value); // 10
//        System.out.println(myQue); // 20, 30
////        peek 은 큐에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 return하는 method
//        int value2 = myQue.peek();
//        System.out.println(value2); // 20
//        System.out.println(myQue); // 20, 30

////        while문을 통한 queue 출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
////        Queue는 일반적으로 while문을 통해 요소를 소모
//        while (!printerQueue.isEmpty()){
//            printerQueue.poll();
//        }

////        LinkedList와 ArrayList 성능차이 비교
////        ArrayList 장점 : 조회성능 빠름, 단점 : 중간 삽입/삭제 성능 저하
////        LinkedList 장점 : 중간 삽입/삭제 성능 빠름, 단점 : 조회 성능 저하
//        LinkedList<Integer> myLinkedList = new LinkedList<>(); // O(n)
//        long startTime = System.currentTimeMillis();
//        for(int i=0; i<1000000; i++){
//            myLinkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedLList의 중간에 값 add 시에 소요시간 : " + (endTime-startTime));
//
//
//        ArrayList<Integer> myArrayList = new ArrayList<>(); // O(n^2)
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0; i<1000000; i++){
//            myArrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayLList의 중간에 값 add 시에 소요시간 : " + (endTime2-startTime2));

//        관련문제 : 카드2, 요세푸스 문제 0

////        길이 제한 큐 (잘 안쓰임)
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4"); // 길이 초과시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 제한된 길이까지만 add. 에러발생X
//        System.out.println(blockingQueue);

////        우선순위 큐 : 데이터를 poll할 때 정렬된 데이터 결과값(최소값 / 최대값) 보장
////        지속적으로 데이터가 추가/제거되면서 전체 데이터가 실시간으로 변경되는 상황에 사용. ***
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); // 정렬은 되어있지 않으나, heap 자료구조를 유지하고 있다.
//        // 다만 꺼낼 때 마다 정렬이 된 값을 꺼낸다.
//
//        while(!pq.isEmpty()){
////            poll할 때마다 최소값을 추출하게 되고 복잡도 log(n). peek은 최소값을 확인만 하고 추출은 X, 복잡도 log(n).
////            전체 데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }
//
////        백준 : 최소힙
////        프로그래머스 : 더 맵게
//
////        최대힙 : poll 할 때 마다 최대값을 추출
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

////        stack : 후입선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); // 마지막에 입력한 값을 꺼내는 것
//        System.out.println(myStack.peek()); // 마지막에 입력한 값을 확인
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());

//        프로그래머스 : 올바른 괄호
//        프로그래머스 : 같은 숫자는 싫어

//        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast(성능이 훨씬 좋아 이것만 씀)
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addFirst(30); // 30, 10, 20
        System.out.println(myDeque.pollLast()); // 20
        System.out.println(myDeque.pollFirst()); // 30
        System.out.println(myDeque.pollFirst()); // 10
    }
}
