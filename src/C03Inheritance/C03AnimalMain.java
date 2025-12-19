package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound2();
        cat.sound();
//        상속 관계일 때는 부모 클래스의 타입을 자식 클래스의 객체 타입으로 지정 가능
        Animal d2 = new Dog();
        d2.sound();
//        부모 클래스의 타입으로 지정 시, 부모 클래스에서 정의된 메서드만 객체에서 사용 가능
//        d2.sound2();
    }
}
class Animal{
    public void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Dog extends  Animal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
    public void sound2(){
        System.out.println("멍멍멍멍");
    }
}
class Cat extends Animal{
    public void sound2(){
        System.out.println("야옹야옹");
    }
}
