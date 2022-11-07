package com.codecool.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Page {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
