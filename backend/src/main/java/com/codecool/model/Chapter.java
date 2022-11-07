package com.codecool.model;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chapter {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
