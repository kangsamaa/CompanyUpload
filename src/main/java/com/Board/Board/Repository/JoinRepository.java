package com.Board.Board.Repository;

import com.Board.Board.entity.TESTDAO;
import com.Board.Board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinRepository extends JpaRepository<User, Integer> {
}
