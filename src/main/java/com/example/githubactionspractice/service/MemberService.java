package com.example.githubactionspractice.service;

import com.example.githubactionspractice.entity.Member;
import com.example.githubactionspractice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void insertMember(String name) {
        memberRepository.save(
                Member.builder()
                        .name(name)
                        .build()
        );
    }

    public Member findMember(String name) {
        return memberRepository.findByName(name);
    }
}
