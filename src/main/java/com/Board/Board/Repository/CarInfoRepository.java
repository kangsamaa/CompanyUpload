package com.Board.Board.Repository;

import com.Board.Board.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInfoRepository  extends JpaRepository<Car, Long> {
}
