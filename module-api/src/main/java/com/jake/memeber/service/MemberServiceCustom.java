package com.jake.memeber.service;

import com.jake.member.model.Member;
import com.jake.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceCustom {

    private final MemberRepository memberRepo;

    public Long signUp(Member member) {
        return memberRepo.save(member).getId();
    }
}
