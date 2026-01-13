package C10Annotation;

import java.lang.reflect.Field;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        리플렉션 : 자바에서 런타임 시점에 클래스, 변수, 메서드에 접근할 수 있는 기술
        Person p1 = new Person();

//        아래와 같은 방식을 통해 private 변수인 name 변수에 직접 접근
        Field nameFiled = Person.class.getDeclaredField("name");
        nameFiled.setAccessible(true);//private이라 할지라도 접근 가능하도록 세팅 변경 가능.
        nameFiled.set(p1, "hongildong");
        System.out.println(p1);
    }
}
class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
