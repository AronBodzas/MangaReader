package com.codecool.model;

import lombok.*;

import javax.persistence.*;

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
    private String pageLink;
    @ManyToOne
    private Chapter chapter;

}
