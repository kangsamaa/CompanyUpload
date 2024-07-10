package com.Board.Board.Controller;

import com.Board.Board.DTO.MemberDTO;
import com.Board.Board.DTO.MemberFormDTO;
import com.Board.Board.Service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signup(){
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(MemberDTO memberDTO){
       userService.create(memberDTO);
        return "signup_form";
    }

    @GetMapping("/complete_signup")
    public String completeSignup(){
        return "complete_signup";
    }
}
