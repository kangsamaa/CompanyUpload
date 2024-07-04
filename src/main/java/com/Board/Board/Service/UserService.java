package com.Board.Board.Service;

import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private final MemberRepository memberRepository;

    public Member create(String username, String password, String email){
        Member member = new Member();
        member.setusername(username);


    }

}
