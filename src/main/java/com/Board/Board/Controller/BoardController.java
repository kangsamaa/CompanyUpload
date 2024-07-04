package com.Board.Board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/BoardList")
    public String getBoardList(){
        return "BoardList";
    }
}
