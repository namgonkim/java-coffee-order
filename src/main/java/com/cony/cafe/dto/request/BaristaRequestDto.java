package com.cony.cafe.dto.request;

import com.cony.cafe.entity.Barista;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BaristaRequestDto {
    private String name;
    private int salary;

    @Builder
    public BaristaRequestDto(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Builder
    public BaristaRequestDto(String name) {
        this.name = name;
    }

    public Barista toEntity() {
        return Barista.builder()
                .name(name)
                .salary(salary)
                .build();
    }
}
