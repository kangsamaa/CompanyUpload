package com.Board.Board.Service;

import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.Mapper.MemberMapper;
import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.TESTDAO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MemberMapper memberMapper;

    private final MemberRepository memberRepository;

    public List<MemberDTO> selectUser(){
        return memberMapper.selectUser();
    }


    public void register(TESTDAO testdao){
        log.info("====START====");
        if(memberRepository.findById(testdao.getUser_id()).isPresent()){
            throw new IllegalArgumentException(("Email is tup"));
        }else{
            memberRepository.save(testdao);
        }
    }
}
