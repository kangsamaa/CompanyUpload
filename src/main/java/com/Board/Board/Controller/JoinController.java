package com.Board.Board.Controller;

import com.Board.Board.DTO.JoinMemberDTO;
import com.Board.Board.Service.MemberService;
import com.Board.Board.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;

@Controller
@RequiredArgsConstructor
public class JoinController {

    @Autowired
    private final MemberService memberService;

    @GetMapping("/membersRegister")
    public String memberRegisterGet(){return "/membersRegister";}

    @PostMapping("/membersRegister")
    public String createMember(JoinMemberDTO joinMemberDTO){
        memberService.join(joinMemberDTO);
        return "redirect:/";
    }
}
