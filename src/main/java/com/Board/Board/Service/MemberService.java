package com.Board.Board.Service;

import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.Mapper.MemberMapper;
import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.TESTDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    private final MemberRepository memberRepository;

    public List<MemberDTO> selectUser(){
        return memberMapper.selectUser();
    }

    public void register(TESTDAO testdao){
        memberRepository.save(testdao);
    }

}
