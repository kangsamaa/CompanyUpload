package com.Board.Board.Service;

import com.Board.Board.DTO.MemberCarDTO;
import com.Board.Board.Repository.CarInfoRepository;
import com.Board.Board.Repository.MemberRepository;
import com.Board.Board.entity.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarService {

    @Autowired
    private final CarInfoRepository carInfoRepositoryRepository;

    public void create(MemberCarDTO memberCarDTO){
        Car car = Car.builder()
                .carName(memberCarDTO.getCarName())
                .avgNenpi(memberCarDTO.getAvgNenpi())
                .memberNenpi(memberCarDTO.getMemberNenpi())
                .build();

        carInfoRepositoryRepository.save(car);
    }

}
