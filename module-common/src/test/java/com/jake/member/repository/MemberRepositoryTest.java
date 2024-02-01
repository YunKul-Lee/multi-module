package com.jake.member.repository;

import com.jake.member.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepo;

    @Test
    public void add() {
        memberRepo.save(new Member("jake", "jake@gmail.com"));
        Member saved = memberRepo.findById(1L).get();
        assertThat(saved.getName()).isSameAs("jake");
    }
}
