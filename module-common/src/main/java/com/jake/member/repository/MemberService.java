package com.jake.member.repository;

import com.jake.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberService extends JpaRepository<Member, Long> {
}
