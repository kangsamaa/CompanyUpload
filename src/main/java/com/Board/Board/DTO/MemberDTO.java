package com.Board.Board.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MemberDTO {

    @Id
    @Column(unique = true)
    private String Userid;

    @NotBlank(message = "Not blank")
    private String Username;
}