package C03Inheritance;

// 안중요함
// 부모 클래스를 상속 받을 때, 자식 객체의 생성자에서는 부모 객체를 자동으로 생성
// 이때, 부모 클래스에 기본 생성자가 없으면 자식 클래스에서 에러 발생
public class C02SuperKeyword extends SuperParents{
    int a;
    public C02SuperKeyword(){
//        super() : 부모 클래스의 생성자를 호출하는 메서드
        super(10);
        this.a = 20;
    }
    public static void main(String[] args) {
        C02SuperKeyword c1 = new C02SuperKeyword();
        c1.display();
    }
    public void display(){
        System.out.println("자식의 변수 : " + this.a);
//        부모의 변수나 메서드에 접근할 때에는 super 키워드를 사용
        System.out.println("부모의 변수 : " + super.a);
    }
}
class SuperParents{
    int a;
    public SuperParents(int a){
        this.a = a;
    }
}
