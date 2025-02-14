package com.example.githubactionspractice.controller;

import com.example.githubactionspractice.entity.Member;
import com.example.githubactionspractice.service.MemberService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BasicController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        String randomString = UUID.randomUUID().toString();
        log.info(randomString);
        return ResponseEntity.ok().body(randomString);
    }

    @GetMapping("/member")
    public ResponseEntity<?> getMember(String name) {
        Member member = memberService.findMember(name);
        return ResponseEntity.ok().body(member);
    }

    @GetMapping("/member/insert")
    public ResponseEntity<?> insertMember(String name) {
        memberService.insertMember(name);
        return ResponseEntity.ok().build();
    }
}
