package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심 로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(){
        memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password) throws IllegalArgumentException{
//        List(DB)에 이메일이 중복일 경우 예외 발생(IllegalArguments)
        Optional<Member> optMember = memberRepository.findByEmail(email);
        if(optMember.isPresent()){
            throw new IllegalArgumentException("중복된 이메일입니다.");
        }
//        객체 조립 후 repository를 통해 저장
        Member newMember = new Member(name, email, password);
        memberRepository.register(newMember);
    }

    public Member findById(long id) throws NoSuchElementException{
//        예외 발생 - 잘못된 ID
        return memberRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("없는 사용자 입니다."));
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Optional<Member> optMember = memberRepository.findByEmail(email);
//        email이 있는지 확인 후 없으면 예외 발생
//        member.orElseThrow(()-> new NoSuchElementException("email이 일치하지 않습니다."));
        Member member = optMember.orElseThrow(()->new NoSuchElementException("email이 없습니다."));
//        password가 일치하는지 확인 후 일치하지 않으면 예외 발생
//        if(!optMember.orElseThrow(()-> new NoSuchElementException("email이 없습니다.")) // member가 있으면
//                .getPassword().equals(password)){ // 패스워드 일치파는지 확인
//            throw new IllegalArgumentException("password가 일치하지 않습니다.");
//        }
        if(member.getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }

    }
}
