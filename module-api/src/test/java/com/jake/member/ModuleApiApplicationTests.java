package com.jake.member;

import com.jake.member.model.Member;
import com.jake.member.service.MemberServiceCustom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ModuleApiApplicationTests {

    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    public void save() {
        Member member = new Member("jake", "jake@gmail.com");
        Long id = memberServiceCustom.signUp(member);
        assertThat(id).isEqualTo(1L);
    }
}
