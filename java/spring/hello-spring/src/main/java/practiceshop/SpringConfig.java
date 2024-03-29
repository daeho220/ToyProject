package practiceshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practiceshop.repository.MemberRepository;
import practiceshop.repository.MemoryMemberRepository;
import practiceshop.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
