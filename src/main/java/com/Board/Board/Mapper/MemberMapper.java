package com.Board.Board.Mapper;

import com.Board.Board.DTO.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectUser();
}
