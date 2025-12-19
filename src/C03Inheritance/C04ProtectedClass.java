package C03Inheritance;

// 안중요함
// class에는 public default 접근제어자만 존재
public class C04ProtectedClass {
    //    변수, 메서드에는 4가지 적븐제어자가 존재
//    public : 프로젝트 전체에서 접근 가능(다른 패키지에서도 접근 가능)
//    private : 클래스 내에서만 접근 가능
//    default : 같은 패키지 내에서만 접근 가능
//    protected : 다른 패키지이더라도 상속 관계인 경우에는 접근 가능
    public String st1 = "hello java1";
    private String st2 = "hello java2";
    String st3 = "hello java3";
    protected String st4 = "hello java4";

}
