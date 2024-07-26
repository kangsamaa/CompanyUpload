package com.Board.Board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
public class Car {

    private Long id;

    private String carName;
    private String avgNenpi;
    private String memberNenpi;

}
