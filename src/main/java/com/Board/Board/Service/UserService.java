package com.Board.Board.Service;

import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private final MemberRepository memberRepository;

    public void create(MemberDTO memberDTO){

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Member member = Member.builder()
                .username(memberDTO.getUsername())
                .password(passwordEncoder.encode(memberDTO.getPassword()))
                .email(memberDTO.getEmail())
                .build();

        memberRepository.save(member);
    }

}
