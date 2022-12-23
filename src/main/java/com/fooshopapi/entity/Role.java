package com.fooshopapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column()
    private ERole name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role(Long id, ERole name) {
        this.id = id;
        this.name = name;
    }
}
