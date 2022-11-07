package com.codecool.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String content;
    private LocalDate publishedDate;
    @ManyToOne
    private Chapter chapter;
//    private User user;

}
