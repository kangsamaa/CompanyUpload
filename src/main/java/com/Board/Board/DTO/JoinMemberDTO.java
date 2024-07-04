package com.Board.Board.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinMemberDTO {

    private String UserName;
    private String UserPassword;
    private String UserEmail;

}
