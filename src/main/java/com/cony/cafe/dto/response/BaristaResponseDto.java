package com.cony.cafe.dto.response;

import com.cony.cafe.entity.Barista;
import lombok.Getter;

@Getter
public class BaristaResponseDto {
    private Long id;
    private String name;
    private int salary;

    public BaristaResponseDto(Barista barista) {
        this.id = barista.getId();
        this.name = barista.getName();
        this.salary = barista.getSalary();
    }
}
