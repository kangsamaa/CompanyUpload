package com.Board.Board.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinMemberDTO {

    private String userName;
    private String userPassword;
    private String userEmail;

}
