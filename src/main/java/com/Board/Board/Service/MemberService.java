package com.Board.Board.Service;

import com.Board.Board.DTO.JoinMemberDTO;
import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.Mapper.MemberMapper;
import com.Board.Board.Repository.JoinRepository;
import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.TESTDAO;
import com.Board.Board.entity.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private final MemberRepository memberRepository;

    @Autowired
    private final JoinRepository joinRepository;

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

    public void join(JoinMemberDTO joinMemberDTO){
        User user = User.builder()
                .userEmail(joinMemberDTO.getUserEmail())
                .userName(joinMemberDTO.getUserName())
                .userPassword(joinMemberDTO.getUserPassword())
                .build();

        joinRepository.save(user);

    }
}
