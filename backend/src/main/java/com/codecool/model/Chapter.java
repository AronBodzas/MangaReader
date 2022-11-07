package com.codecool.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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
    private int number;
    private LocalDate publishedDate;
    @OneToMany(mappedBy = "chapter")
    private List<Page> pageList;
    @OneToMany(mappedBy = "chapter")
    private List<Comment> commentList;
    @ManyToOne
    private Product product;

}
