package com.cony.cafe.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Barista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "salary", nullable = true)
    private Integer salary;

    @Builder
    public Barista(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Builder
    public Barista(String name) {
        this.name = name;
    }

    // update
    public void updateSalary(int salary) {
        this.salary = salary;
    }
}
