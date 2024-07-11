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
import org.springframework.web.bind.annotation.RequestMethod;

@RequiredArgsConstructor
@Controller
public class MemberController {

    @Autowired
    private UserService userService;

    /*
    @GetMapping("/signup")
    public String signup(){
        return "signup_form";
    }
    */

    @GetMapping("signup_before")
    public String signupBefore(){
        return "signup_form_before";
    }

    @GetMapping("default")
    public String default_a(){
        return "default";
    }

    @PostMapping("/signup") //formaction register member
    public String signup(MemberDTO memberDTO){
       userService.create(memberDTO);
        return "index"; //root
    }

    @GetMapping("/complete_signup")
    public String completeSignup(){
        return "/"; //일단 루트로 던지기
    }

    @GetMapping("/contact-page")
    public String contactPage(){
        return "contact-page";
    }
}
