package com.Board.Board.Repository;

import com.Board.Board.entity.TESTDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MemberRepository extends JpaRepository<TESTDAO, Integer> {
}
