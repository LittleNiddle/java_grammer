package C08Thread;

public class Library {
    private static int bookCount = 100;
//    syncronized : 메서드 내에서 1개의 스레드만을 실행되도록 보장.
//public static void borrow() throws InterruptedException {
    public static synchronized void borrow() throws InterruptedException {
        if(bookCount > 0){
            Thread.sleep(100);
            bookCount --;
            System.out.println("대출 완료");
        } else {
            System.out.println("대출 불가");
        }
    }
    public static int getBookCount(){
        return bookCount;
    }
}
