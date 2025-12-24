package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소 역할을 하는 계층
// DB의 CRUD를 수행하는 계층
public class MemberRepository {
    private List<Member> memberList;

    public MemberRepository(){
        this.memberList = new ArrayList<>();
    }

    public void register(Member member){
        this.memberList.add(member);
    }

    public Optional<Member> findByEmail(String email){
////        email이 list에 있는지 없는지 확인
//        Member member = null;
//        for(Member m : memberList){
//            if(m.getEmail().equals(email)) {
//                member = m;
//                break;
//            }
//        }
//        return Optional.ofNullable(member);
        return this.memberList.stream().filter(a->a.getEmail().equals(email)).findFirst();
    }

    public Optional<Member> findById(long id){
        Member member = null;
        for(Member m : this.memberList){
            if(m.getId() == id) member = m;
        }
        return Optional.ofNullable(member);
    }

    public List<Member> findAll(){
        return this.memberList;
    }

}
