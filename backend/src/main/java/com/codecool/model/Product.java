package com.codecool.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private int length;
    @OneToMany(mappedBy = "product")
    private List<Chapter> chapterList;
    private String coverPage;
    private LocalDate startDate;


}
