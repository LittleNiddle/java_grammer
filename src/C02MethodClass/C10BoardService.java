package C02MethodClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    <게시판서비스>
    1.계좌객체 : Author, Post
    2.자료구조 : List(authorList, postList)
    3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
        3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
        3-2.회원 전체 목록 조회 : id, email
        3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
        3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
        3-5.게시물 목록 조회 : id(post), title
        3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
 */
public class C10BoardService {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("사용하실 서비스 번호를 입력해주세요");
            System.out.println("        1.회원가입\n" +
                    "        2.회원 전체 목록 조회\n" +
                    "        3.회원 상세 조회\n" +
                    "        4.게시글 작성\n" +
                    "        5.게시물 목록 조회\n" +
                    "        6.게시물 상세 조회");
            int number = Integer.parseInt(sc.nextLine());

            if(number == 1){
                //이름, 이메일, 비밀번호
                System.out.println("회원 가입 서비스입니다.");
                System.out.println("이름을 입력하세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력하세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String password = sc.nextLine();

                // 회원가입
                // 이메일 중복이 아니면
                authorList.add(new Author(name, email, password));

            } else if(number == 2){
                System.out.println("회원 전체 목록 조회 서비스입니다.");
                for(Author a : authorList){
                    System.out.println("ID : " + a.getId() + ", Email : " + a.getEmail());
                }

            } else if (number == 3) {
                System.out.println("회원 상세 조회 서비스입니다.");
                System.out.println("ID를 입력해주세요.");
                Long id = Long.parseLong(sc.nextLine());
                Author a = authorList.get(Math.toIntExact(id));
                // id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                id = a.getId();
                String email = a.getEmail();
                String password = a.getPassword();
//                int count = 0;
//                for(Post p : postList){
//                    if(email.equals(p.getAuthorEmail())) count ++;
//                }
                int count = a.getPostList().size();
                System.out.println("ID : " + id + ", Email : " + email + ", Password : " + password + ", Posting Count : " + count);

            } else if (number == 4) {
                // id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
                System.out.println("게시글 작성 서비스입니다.");
                System.out.println("제목을 입력하세요.");
                String title = sc.nextLine();
                System.out.println("내용을 입력하세요.");
                String contents = sc.nextLine();
                System.out.println("작성자 이메일을 입력하세요");
                String authorEmail = sc.nextLine();
                for(Author a : authorList){
                    if(a.getEmail().equals(authorEmail)){
                        Post p = new Post(title, contents, a);
                        postList.add(p);

                        break;
                    }
                }

            } else if(number == 5){
                System.out.println("게시물 목록 조회 서비스입니다.");
                for(Post p : postList){
                    System.out.println("ID : " + p.getId() + ", Title : " + p.getTitle());
                }

            } else if(number == 6){
                // (게시글 id로 조회) : id, title, contents, 작성자이름
                System.out.println("게시물 상세 조회 서비스입니다.");
                System.out.println("게시물 ID를 입력하세요");
                Long id = Long.parseLong(sc.nextLine());
                Post p = postList.get(Math.toIntExact(id));
                String title = p.getTitle();
                String contents = p.getContents();
                String name = p.getAuthor().getName();
//                for(Author a : authorList){
//                    if(p.getAuthorEmail().equals(a.getEmail())) {
//                        name = a.getName();
//                        break;
//                    }
//                }
                System.out.println("ID : " + id + ", Title : " + title + ", Contents : " + contents + ", Name : " + name);

            } else break;
        }
    }
}
class Author{
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Post> postList;
    private static long staticId;

    public Author(String name, String email, String password) {
        id = staticId;
        staticId ++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.postList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPostList() {
        return postList;
    }
}

class Post{
    private Long id;
    private String title;
    private String contents;
    // private String authorEmail;
    private Author author;
    private static long staticId;

    public Post(String title, String contents, Author author) {
        this.id = staticId;
        staticId ++;
        this.title = title;
        this.contents = contents;
        // this.authorEmail = authorEmail;
        this.author = author;
//        여기서 this는 지금 만들고자 하는 post객체를 의미
        this.author.getPostList().add(this);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

//    public String getAuthorEmail() {
//        return authorEmail;
//    }

    public Author getAuthor(){
        return author;
    }

}
