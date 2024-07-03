package com.Board.Board.Controller;

import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.Service.MemberService;
import com.Board.Board.entity.TESTDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public String getAllUser(Model model){
        List<MemberDTO> selectUser = memberService.selectUser();
        model.addAttribute("list",selectUser);
        return "members";
    }

    @GetMapping("/register")
    public String registerGet(){
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(TESTDAO testdao){

        memberService.register(testdao);
        return "redirect:/members";
    }
}
