package hello.core.member;

public class MemberServiceImpl implements MemberService{
    // final은 한 번 값을 설정하면 그 값을 다시 설정할 수 없다는 뜻이다.
    // MemberRepoistory(추상화), MemoryMemberRepository(구체화)가 동시에 의존되었기 때문에 DIP 위반이다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
