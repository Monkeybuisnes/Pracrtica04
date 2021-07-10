package com.model;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

public class playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer plId;
    private String plName;

    @OneToMany(mappedBy = "")
    private List<Songs> orders;
}
}
